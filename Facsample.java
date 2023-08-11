package org.tes;

public class Facsample extends Baseclass {
	
	public static void main(String[] args) {
		launchbrowser();
		get("https://www.facebook.com/");
		max();
		FacebookPojo m = new FacebookPojo();
		passkey(m.getEmail(), "6379321053");
		
		passkey(m.getPassword(), "sundar");
		
		driver.navigate().refresh();
		
		passkey(m.getEmail(), "7200449662");
		
	}

}
