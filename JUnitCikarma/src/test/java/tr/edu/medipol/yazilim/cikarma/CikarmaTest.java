package tr.edu.medipol.yazilim.cikarma;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilim.cikarma.Cikarma;

public class CikarmaTest {


private Cikarma testEdilenSinif = new Cikarma();
	
	@Test
	public void testIkiSayiyiCikar() {
	
		int sayi1 = 1453;
		int sayi2 = 53;
		int beklenenSonuc = 1400;
		
		
		int sonuc = testEdilenSinif.cikar(sayi1, sayi2);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}
	
	@Test
	public void testDortSayiyiCikar() {
		
		int sayi1 = 1453;
		int sayi2 = 53;
		int sayi3 = 1;
		int sayi4 = 2;
		int beklenenSonuc = 0;
		
		
		int sonuc = testEdilenSinif.cikar(sayi1, sayi2, sayi3, sayi4);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}

}