package com.bikesowroom;

public class HomePage {
	public void intro() throws InterruptedException {
		String intro="Welcome to Tamilnadu Yamaha Bike ShowRoom Online\n";

		for (int i = 0; i < intro.length(); i++) {
			System.err.print(intro.charAt(i));
			Thread.sleep(80);
		}	
	}
	public void customerOptions() {
		System.out.println("        **********HOME PAGE**********");
		System.out.println("BOOK NOW '1' :");
		System.out.println("ALL CUSTOMER DETAILS '2' :");
		System.out.println("SEARCH DETAILS BY CUSTOMER MOBILE NUMBER '3' :");
		System.out.println("MY PRODUCTS ENTER '4' :");
		System.out.println("SERVICE INFORMATION '5' :");
		System.out.println("EXIT ENTER '0' :");
	}
	public void exit() throws InterruptedException {
		String a="ThAnK YoU FoR YoUr ViSiT\nPlEaSe WeAr HeLmEt PrOpErLY";
		for (int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i));
			Thread.sleep(70);
		}
	}
	public void defaultOption() {
		System.out.println("!!!!!!!! You Entered Wrong Option!!!!!!!!");
		System.out.println(" => Please Enter Correct Option");
	}
}
