package mukemmelSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//mukemmel sayı // 6 --> 1,2,3 e bölünür.
		// 28 --> 1,2,4,7,14 e bölünür.
		int number=28;
		int total =0;
		if (number<=0) {
			System.out.println("Geçersiz sayı girdiniz.");
			return;
		}
		for (int i = 1; i <number; i++) {
			if (number%i==0) {
				total=total +i;
			}
			
			}
		
		if (total==number) {
			System.out.println("Mükemmel sayıdır.");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
