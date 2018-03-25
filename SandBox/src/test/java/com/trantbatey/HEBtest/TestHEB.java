package com.trantbatey.HEBtest;

/**
 * This is the test of the HEB class. 
 * 
 * @author Trant Batey
 *
 */

import junit.framework.TestCase;
import com.trantbatey.heb.*;

public class TestHEB extends TestCase {
	
	public void testTestUnitTest_Success() throws Exception {
		HEB anHEB = new HEB();
		assertEquals(anHEB.testUnitTest(true), true);
	}
	
	public void testTestUnitTest_Failure() throws Exception {
		HEB anHEB = new HEB();
		assertFalse(anHEB.testUnitTest(false));
	}
}
