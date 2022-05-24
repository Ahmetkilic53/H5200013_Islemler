package tr.edu.medipol.yazilim.carpma;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilim.carpma.Carpma;

public class CarpmaTest {

private Carpma testEdilenSinif = new Carpma();
	
	@Test
	public void testIkiSayiyiCarp() {
	
		int sayi1 = 1453;
		int sayi2 = 53;
		int beklenenSonuc = 77009;
		
		
		int sonuc = testEdilenSinif.carp(sayi1, sayi2);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}
	
	@Test
	public void testDortSayiyiCarp() {
		
		int sayi1 = 1453;
		int sayi2 = 53;
		int sayi3 = 1;
		int sayi4 = 2;
		int beklenenSonuc = 0;
		
		
		int sonuc = testEdilenSinif.carp(sayi1, sayi2, sayi3, sayi4);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}

}