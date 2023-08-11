package org.tes;

public class Sampleflip extends Baseclass {

	public static void main(String[] args) {
		launchbrowser();
		get("https://www.flipkart.com/");
		
		flipPojo j = new flipPojo();
		passkey(j.getEmail(), "6379321053");
		
		driver.navigate().refresh();
		
		passkey(j.getEmail(), "sundarcrazie@gmail.com");
		
	}
}
