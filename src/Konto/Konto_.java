public class Konto{
	// Attribute
	private double kontostand;
	private int ktoNr;
	private double zins;
	private int dispo;

	public Konto(int ktoNr, int dispo, double zins){
		this.ktoNr = ktoNr;
		this.dispo = dispo;
		this.zins = zins;
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

