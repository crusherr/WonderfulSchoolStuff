public class TestUI {
	public static void main(String[] args) {
		// 1. create objects
		Konto konto1 = new Konto();
		Konto konto2 = new Konto();

		// 2. fill properties
		konto1.inhaber = "Hans Peter";
		konto1.iban = "DE041178";
		konto1.kontostand = 20;

		konto2.inhaber = "Peter Mueckstein";
		konto2.iban = "DE041337";
		konto2.kontostand = 420;

		// 3. output
		printKonto(konto1);
		System.out.println();
		printKonto(konto2);
	}

	public static void printKonto(Konto konto) {
		System.out.println("Inhaber: "+ konto.inhaber);
		System.out.println("Iban: "+ konto.iban);
		System.out.println("Kontostand: " + konto.kontostand +"€");
	}
}