package com.trantbatey.heb;

/**
 * This is a master module for the HEB interview project. 
 * 
 * @author Trant Batey
 *
 */
import static java.lang.System.out;

public class HEB {
	
	/**
	 * The main methods starts all of the exercise program.
	 * 
	 * @param args 
	 * 		Input arguments to main currently not used
	 */
	public static void main(String[] args) {
		out.println("HEB Interview Project");
		
		// test class
		HEB anHEB = new HEB();
		out.println(anHEB.testUnitTest(true));
	}
	
	public boolean testUnitTest(boolean flag) {
		return flag;
	}
}
