public class Konto{
	// Attribute
	String inhaber;
	double kontostand;
	String iban;

	// Methoden
	public void einzahlen(double betrag){
		kontostand += betrag;
	}

	public boolean auszahlen(double betrag){
		if (betrag > kontostand) {
			return false;
		}
		kontostand -= betrag;
		return true;
	}

	public double kontostand(){
		return kontostand;
	}
}

