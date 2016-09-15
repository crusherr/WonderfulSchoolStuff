public class Schueler{
	private String name;
	private String klasse;
	private int alter;

	public Schueler(String name, String klasse, int alter){
		this.name = name;
		this.klasse = klasse;
		this.alter = alter;
	}

	public void setName(String name) {
			this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setKlasse(String klasse){
		this.klasse = klasse;
	}

	public String getKlasse(){
		return this.klasse;
	}

	public void setAlter(int alter){
		this.alter = alter;
	}

	public int getAlter(){
		return this.alter;
	}

	public String toString(){
		String product = this.name + " geht in die Klasse " + this.klasse + " und ist " + this.alter + " Jahre alt.";
		return product;
	}
}