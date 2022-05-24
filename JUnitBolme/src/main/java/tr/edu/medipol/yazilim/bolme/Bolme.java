package tr.edu.medipol.yazilim.bolme;

public class Bolme {

	static int bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
	
	static int bol(int ... sayilar) {
		int bolumSonuc = 0;
		for (int sayi : sayilar) {
			bolumSonuc /= sayi;
		}
		return bolumSonuc;
	}
	
	
	public static void main(String[] args) {
		
		int sonuc = bol(100,10);
		
		
		
		System.out.println("100 / 10 = " + sonuc);
		
	}

}