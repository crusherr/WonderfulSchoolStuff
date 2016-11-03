public class Bankkunde{
	private String name;
	private int kundennummer;

	public Bankkunde(String name, int kundennummer){
		this.name = name;
		this.kundennummer = kundennummer;
	}

	public String toString(){
		return this.name + " (" + this.kundennummer + ")";
	} 
}