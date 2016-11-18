public class Inserent{
	
	private String name;
	private String telefonummer;
	private String Kontonummer;
	private String bankleitzahl; 

	public Inserent(String n, String t, String k, String b){
		this.name = n;
		this.telefonummer = t;
		this.Kontonummer = k;
		this.bankleitzahl = b;
	}

	public String toString() {
		return "Name: "+ this.name +"\t\n"
		+ "TelNr: " + this.telefonummer + "\t\n"
		+ "Kontoverbindung " + this.Kontonummer + " " + this.bankleitzahl + "\t\n";
	}

	public void setTeleNr(String t){
		this.telefonummer = t;
	}

	public void setKontoNr(String k){
		this.Kontonummer = k;
	}

	public void setBlz(String b){
		this.bankleitzahl = b;
	}
}