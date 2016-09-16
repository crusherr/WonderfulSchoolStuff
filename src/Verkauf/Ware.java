public class Ware{
	private String rubrik;
	private String titel;
	private String beschreibung;
	private double preis;

	public void setRubrik(String rubrik){
		this.rubrik = rubrik;
	}

	public String getRubrik(){
		return this.rubrik;
	}

	public void setTitel(String titel){
		this.titel = titel;
	}

	public String getTitel(){
		return this.titel;
	}

	public void setBeschreibung(String beschreibung){
		this.beschreibung = beschreibung;
	}

	public String getBeschreibung(){
		return this.beschreibung;
	}

	public void setPreis(double preis){
		this.preis = preis;
	}

	public double getPreis(){
		return this.preis;
	}
}