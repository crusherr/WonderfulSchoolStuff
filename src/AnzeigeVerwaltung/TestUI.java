public class TestUI{
	public static void main(String[] args)
	{
		Inserent helga = new Inserent("Helga Hasselbusch", "0641/123456", "77888", "50090005");
		Anzeige tisch = new Anzeige("gut erhaltener Gartentisch", "Garten", "weiß, Plastik, sehr stabil, 120 cm im Durchmesser, 20€", helga);
		
		Inserent willi = new Inserent("Willi Kuhn", "06447/8776", "443328", "40080700");
		Anzeige aqua = new Anzeige("Aquarium 60l", "Tiermarkt", "incl. Abdeckung mit Beleuchtung, Innenpumpe, 35€ VB.", willi);
		Anzeige anzug = new Anzeige("Kinder Neoprenanzug", "Sport", "Größe 148, kaum getragen, 19€", willi);

		System.out.println(helga.toString());
		System.out.println(tisch.toString());
		System.out.println("Kosten: "tisch.berechnePreis() + "€\n");

		System.out.println(willi.toString());
		System.out.println(aqua.toString());
		System.out.println(anzug.toString());
		double p1 = aqua.berechnePreis();
		double p2 = anzug.berechnePreis();
		double g = p1 + p2;
		System.out.println("Kosten\nAnzeige1: " + p1 + "€\nAnzeige2: " + p2 + "€\nGesamt: " + g + "€" );
	}
}