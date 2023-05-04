package com.testcases.MeetAhsan2022;

import java.util.Random;

public class GenerateRandomString {
	public static String getSaltString() {
	    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    StringBuilder salt = new StringBuilder();
	    Random rnd = new Random();
	    while (salt.length() < 18) { // length of the random string.
	        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	        salt.append(SALTCHARS.charAt(index));
	    }
	    String saltStr = salt.toString();
	    return saltStr;

	}
	
}
