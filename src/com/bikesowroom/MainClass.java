package com.bikesowroom;
import java.io.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		Scanner  scanner= new Scanner(System.in);
		HomePage homePage = new HomePage();
	//	homePage.intro();

		BikeModelAndMyProduct myProduct= new BikeModelAndMyProduct();

		boolean shouldContinue = true;

		while (shouldContinue) { 		
			homePage.customerOptions();
			String customerOption = scanner.next();

			switch (customerOption) {

			case "1":
				Registration registration= new Registration();
				registration.registration();
				break;	

			case "2":
				AllCustomerDetails allCoustomerDetails = new AllCustomerDetails();
				allCoustomerDetails.passWordVerfication();
				break;

			case "3":
				SearchDetailsByMobileNumber.searchByMobileNumber();		
				break;

			case "4":
				myProduct.bikeModel();
				break;

			case "5":
				ServiceAndInfo.customerFeedBack();	
				break;	

			case "0":
				scanner.close();
				homePage.exit();
				shouldContinue=false;
				break;

			default:
				homePage.defaultOption();
				break;
			}
		}
	}
}