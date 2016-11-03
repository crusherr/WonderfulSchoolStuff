public class Konto{
	// Attribute
	private double kontostand;
	private int ktoNr;
	private static double zins = 12.5;
	private int dispo;

	private static int zaehler = 10000;

	public Konto(int dispo){
		this.zaehler++;
		this.ktoNr = this.zaehler;
		this.dispo = dispo;
	}

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

	public void setDispo(int dispo) {
		this.dispo = dispo;
	}

	public void setZins(double zins){
		this.zins = zins;
	}

	public double getKontostand(){
		return this.kontostand;
	}

	public String druckeKontoDaten() {
		return "Kontonummer\t\t: "+this.ktoNr + "\n"
		 + "Kontostand\t\t: "+this.kontostand + " EURO\n" 
		 + "Dispositionskredit\t: "+this.dispo + " EURO\n" 
		 + "Ueberziehungszinsen\t: "+this.zins + " %";
	}
}

