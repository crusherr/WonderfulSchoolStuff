public class Anzeige{
	private static double grundpreis = 8 ;
	private static double preisfaktor = 0.035;
	private static double mehrwertsteuer = 0.19;

	private Inserent inserent;
	private String titel;
	private String rubrik;
	private String beschreibung;

	public Anzeige(String t, String r, String b, Inserent i){
		this.titel = t;
		this.rubrik = r;
		this.beschreibung = b;
		this.inserent = i;
	}

	public String toString(){
		return "Titel: " + titel +"\n"
		 + "Rubrik: " + rubrik + "\n"
		 + "Beschreibung: " + beschreibung + "\n";
	}

	public void setTitel(String t){
		this.titel = t;
	}

	public void setRubrik(String r){
		this.rubrik = r;
	}

	public void setBeschreibung(String b){
		this.beschreibung = b;
	}

	public static double getGrundpreis(){
		return grundpreis;
	}

	public static double getPreisfaktor(){
		return preisfaktor;
	}

	public static double getMehrwertsteuer(){
		return mehrwertsteuer;
	}

	public double berechnePreis(){
		int wordcount = titel.length() + rubrik.length() + beschreibung.length();
		double brutto = grundpreis + preisfaktor * wordcount;
		return brutto + brutto*mehrwertsteuer;
	}


}