package com.exc;

import java.util.Scanner;

public class TrackClass {
	 static String mandatory=null; 
	public static void main(String[] args) throws Exception {
		parent();
		try {
			System.out.println("try");
			throw new Exception("Exception heere");
		}
		catch(Exception e) {
			System.out.println("Exception is out "+ e.getMessage());
			System.exit(0);
		}
		
		finally {
			System.out.println("I am finally bye!!");
		}
		//System.out.println("out");
	}
	public static void parent() throws Exception {
		if(mandatory==null) {
			//throw new InsufficientDataException();
			//TODO
		}
	}
}
