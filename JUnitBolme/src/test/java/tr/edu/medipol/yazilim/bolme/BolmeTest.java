package tr.edu.medipol.yazilim.bolme;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

private Bolme testEdilenSinif = new Bolme();
	
	@Test
	public void testIkiSayiyiBol() {
	
		int sayi1 = 100;
		int sayi2 = 10;
		int beklenenSonuc = 10;
		
		
		int sonuc = testEdilenSinif.bol(sayi1, sayi2);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}
	
	@Test
	public void testDortSayiyiBol() {
		
		int sayi1 = 100;
		int sayi2 = 10;
		int sayi3 = 1;
		int sayi4 = 2;
		int beklenenSonuc = 0;
		
		
		int sonuc = testEdilenSinif.bol(sayi1, sayi2, sayi3, sayi4);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}

}