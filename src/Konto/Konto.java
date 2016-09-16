public class Konto{
	// Attribute
	private String inhaber;
	private double kontostand;
	private String iban;

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

	public void setIban(String iban){
		this.iban = iban;
	}

	public String getIban(){
		return this.iban;
	}

	public void setInhaber(String inhaber){
		this.inhaber = inhaber;
	}

	public String getInhaber(){
		return this.inhaber;
	}

	public double getKontostand(){
		return this.kontostand;
	}
}

