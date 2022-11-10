package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// en küçük arkadas sayı 220 ve 284 tür.
		
		int sayi1 = 222;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0) {
				toplam1=toplam1 + i;
			}
			
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2%i==0) {
				toplam2=toplam2 + i;
			}
			
		}
		if (sayi1==toplam2 &&sayi2==toplam1) {
			System.out.println("bu iki sayı arkadaştır.");
		}
		else {
			System.out.println("bu iki sayı arkadaş değildir.");
		}
	}

}
