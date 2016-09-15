public class TestUI {
	public static void main(String[] args) {
		// 1. create objects
		Konto konto1 = new Konto();

		// 2. fill properties
		konto1.setInhaber("Peter Mueckstein");
		konto1.setIban("DE041337");
		konto1.einzahlen(420);

		// 3. output
		printKonto(konto1);

	}

	public static void printKonto(Konto konto) {
		String inhaber = konto.getInhaber();
		String iban = konto.getIban();
		double kontostand = konto.getKontostand();
		System.out.println("Inhaber: "+ inhaber);
		System.out.println("Iban: "+ iban);
		System.out.println("Kontostand: " + kontostand +"€");
	}
}