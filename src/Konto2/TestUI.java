public class TestUI {
	public static void main(String[] args) {
		// 1. create objects
		
		Konto konto1 = new Konto(10000);
		Konto konto2 = new Konto(500);

		// 2. fill properties
		konto1.einzahlen(1275);
		konto2.einzahlen(-356.89);

		// 3. output
		System.out.println(konto1.druckeKontoDaten());
		System.out.println();
		System.out.println(konto2.druckeKontoDaten());
	}

}