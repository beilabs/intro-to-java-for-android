package com.example.itj_junitexample.test;

import com.example.itj_junitexample.NumberCruncher;
import android.test.AndroidTestCase;

public class NCTester extends AndroidTestCase {

	public void testIsbValue() {
		NumberCruncher oNC = new NumberCruncher();
		oNC.setbValue(false);
		assertFalse(oNC.isbValue());
		oNC.setbValue(true);
		assertTrue(oNC.isbValue());
	}

	public void testCubed() {
		NumberCruncher oNC = new NumberCruncher();
		oNC.setFirstNum(10);
		oNC.setSecondNum(10);
		
		assertEquals(1000, oNC.cubed(10));
		assertEquals("10 + 10 = 20", oNC.toString());
	}
	
	public void testToString() {
		NumberCruncher oNC = new NumberCruncher();
		oNC.setFirstNum(10);
		oNC.setSecondNum(10);
		assertEquals("10 + 10 = 20", oNC.toString());
	}

}
