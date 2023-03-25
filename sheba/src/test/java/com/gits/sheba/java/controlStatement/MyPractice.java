package com.gits.sheba.java.controlStatement;

public class MyPractice {
	
	/* let say, i have a survey and i need to check the zipcode or areacode is working or not. 
	 * then can i use this code ? 
    */
	
	static public void switchStatement(int zipcode) {
		
		switch(zipcode) {
		case(12345):{
			System.out.println("zip code is 12345");
			break;
		}
		case(89876):{
			System.out.println("zip code is 89876");
			break;
		}
		case(40567):{
			System.out.println("zip code is 40567");
			break;
		}
		case(10475):{
			System.out.println("zip code is 10475");
			break;
		}
		}
     }
	
	
	public static void main(String[] args) {
		switchStatement(10475);
		
	}
	
}
