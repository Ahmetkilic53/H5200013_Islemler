package tr.edu.medipol.yazilim.cikarma;

public class Cikarma {

	static int cikarma(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}
	
	static int cikarma(int ... sayilar) {
		int cikarmaSonuc = 0;
		for (int sayi : sayilar) {
			cikarmaSonuc -= sayi;
		}
		return cikarmaSonuc;
	}
	
	
	public static void main(String[] args) {
		
		int sonuc = cikarma(1453,53);
		
		System.out.println("1453 - 53 = " + sonuc);
		
	}

}