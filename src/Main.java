import java.util.*;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        testKonto();
    }

    public void testKonto(){
        Konto a = new Konto();
        System.out.println(a.kontostand());
        a.einzahlen(200);
        System.out.println(a.kontostand());
        System.out.println(a.auszahlen(100));
        System.out.println(a.kontostand());
    }

}

class customScanner {

    Scanner input;

    public customScanner(InputStream input) {
        this.input = new Scanner(input);
    }

    public Object scan(Scanable subject) {
        boolean isValid = false;
        Object result = null;
        while (!isValid) {
            try {
                System.out.print(subject.getMessage());
                String raw = input.next();
                System.out.println("");
                result = subject.Convert(raw);
                isValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("Ups, something gone wrong \n Sorry :(");
            } catch (Exception ufce) {
                System.out.println(subject.getErrorMessage());
                System.out.println(ufce.getMessage());
            }
        }
        return result;
    }

    public int getInt(Int32Scanner scanner) {
        return ((int) scan(scanner));
    }

    public double getDouble(DoubleScanner scanner) {
        return ((double) scan(scanner));
    }

}

class Scanable {

    protected String msg;
    protected String err;

    public Scanable(String msg, String err) {
        this.msg = msg;
        this.err = err;
    }

    public Scanable() {
    }

    public String getMessage() {
        return msg;
    }

    public String getErrorMessage() {
        return err;
    }

    // Override this method
    public Object Convert(String input) throws Exception
    {
        return new Object();
    }
}

class Int32Scanner extends Scanable {

    int min;
    int max;

    public Int32Scanner(String msg, String err, int min, int max) {

        super(msg, err);
        this.min = min;
        this.max = max;
    }


    @Override
    public Object Convert(String input)
    throws Exception
    {
        int result = 0;
        input = Pattern.compile(Matcher.quoteReplacement("[a-z]*")).matcher(input).replaceAll("");
        result = Integer.parseInt(input);
        if (result < min || result > max) {
            throw new Exception("Wert muss zwischen " + min + " und " + max + " liegen")                                                                                                                                                                                                                                                                                                  ;
        }
        return result;
    }
}

    class DoubleScanner extends Scanable {

        double min;
        double max;

        public DoubleScanner(String msg, String err, double min, double max) {

            super(msg, err);
            this.min = min;
            this.max = max;
        }

        @Override
        public Object Convert(String input)
        throws Exception
        {
            double result = 0;
            input = input.replace(",", ".");
            input = Pattern.compile(Matcher.quoteReplacement("[a-z]*")).matcher(input).replaceAll("");

            result = Double.parseDouble(input);
            if (result < min || result > max) {
                throw new Exception("Wert muss zwischen " + min + " und " + max + " liegen");
            }

            return result;
        }
    }
