package com.bikesowroom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

	Scanner scanner = new Scanner (System.in);
	String bikeModel;
	CustomerDatails customerDatails = new CustomerDatails();

	public void registration() throws IOException, InterruptedException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(FileLocation.location());
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<CustomerDatails> arrayList = (ArrayList<CustomerDatails>) objectInputStream.readObject();

		getCustomerName();
		System.out.println("Your Name Is:"+customerDatails.getCustomerName()+"\n");

		getCustomerMobile();
		System.out.println("Your Mobile Number Is :"+"+91-"+customerDatails.getMobile()+"\n");

		getAge();
		System.out.println("Your Age Is :"+customerDatails.getCustomerAge()+"\n");

		outer: while(true) {
			System.out.println("Enter Your Option\n-> 1 R15M(B)\n-> 2 R15 V4\n-> 3 MotoGB Edition\n-> 4 R15S\n-> 5 R15\n-> 6 MT-15\n-> 7 FZS 25\n-> 8 FZ 25\n-> 9 FZ-X\n-> 10 FZ-S F1\n-> 11 FZ-F1");	
			String productModel = scanner.next();

			switch (productModel) {
			case "1":
				bikeModel="R15M(B)";
				break outer;
			case "2":
				this.bikeModel="R15 V4";	
				break outer;
			case "3":
				this.bikeModel="MotoGB Edition";	
				break outer;
			case "4":
				this.bikeModel="R15S";
				break outer;
			case "5":
				this.bikeModel="R15";
				break outer;
			case "6":
				this.bikeModel="MT-15";
				break outer;
			case "7":
				this.bikeModel="FZS 25";
				break outer;
			case "8":
				this.bikeModel="FZ 25";
				break outer;
			case "9":
				this.bikeModel="FZ-X";
				break outer;
			case "10":
				this.bikeModel="FZ-S F1";
				break outer;
			case "11":
				this.bikeModel="FZ-F1";
				break outer;
			default:
				System.out.println("Invalid Selection \nPlease Enter Correct Option");
				break;
			}
		}
		customerDatails.setBikeModel(bikeModel);
		System.out.println("Your Bike Option IS :"+customerDatails.getBikeModel()+"\n");

		System.out.println("Enter Your Bike Number : ");
		customerDatails.setBikeNumber(scanner.next().toUpperCase());
		System.out.println("Your Bike Number Is : "+customerDatails.getBikeNumber()+"\n");

		arrayList.add(customerDatails);
		objectInputStream.close();
		fileInputStream.close();

		File file = new File(FileLocation.location());
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(arrayList);

		System.out.println("@ @ Registration Successfully\n =\t~ Thanks For Your Registration ~");

		objectOutputStream.flush();
		fileOutputStream.close();
		objectOutputStream.close();
	}

	private void getAge() throws InterruptedException {
		boolean customerAgeShouldContinue=true;
		while(customerAgeShouldContinue) {
			System.out.println("Enter Your Age (In Any Govt ID) :");
			String customerAge = scanner.next();
			int counter=0;
			for (int i = 0; i <customerAge.length(); i++) {
				if (Character.isDigit(customerAge.charAt(i))==true) {
					counter++;
				}

			}
			if (customerAge.length()==counter) {
				if(Integer.parseInt(customerAge)>=18) {
					customerDatails.setCustomerAge(customerAge);
					customerAgeShouldContinue=false;
				}
				else {
					System.out.println("=> Your Age Is : =>"+customerAge);
					System.out.println("^ ^ You Are Not Eligibe For Driving !!\n *");
					HomePage homePage = new HomePage();
					homePage.exit();

					customerAgeShouldContinue=false;
					for (int i = 0; i < 5; i++) {

					}
				}
			}else{
				System.out.println("Invalid");
			}
		}
	}
	private void getCustomerMobile() {
		boolean customerMobileShouldContinue=true;
		while (customerMobileShouldContinue) {
			System.out.println("Enter Your Mobile Number : ");
			String customerMobile = scanner.next();	
			int counter=0;

			for (int i = 0; i < customerMobile.length(); i++) {
				char customerNameCharacter=customerMobile.charAt(i);
				if(Character.isDigit(customerNameCharacter) == true) {
					counter++;
				}
			}
			if(customerMobile.length()!=10) {
				System.out.println("<< Invalid Mobile Number >>\n\t~ Check Your Mobile Number ~\n\t\t*_* Try Again *_*");
			}
			else if (customerMobile.length()==counter) {
				if(customerMobile.length()==10) {
					customerDatails.setMobile(customerMobile);
					customerMobileShouldContinue=false;
				}
			}

		}
	}

	public void getCustomerName() {
		boolean customerNameShouldContinue=true;
		while (customerNameShouldContinue) {
			System.out.println("Enter Your Name ( -> in ' Aadhar ')");
			String customerName = scanner.next();	
			int counter=0;
			String invalidCharacter = "";
			for (int i = 0; i < customerName.length(); i++) {
				char customerNameCharacter=customerName.charAt(i);
				if(!Character.isDigit(customerNameCharacter) == true) {
					counter++;
					invalidCharacter+=customerNameCharacter+" ";
				}
			}
			if (customerName.length()==counter) {
				customerDatails.setCustomerName(customerName);
				customerNameShouldContinue=false;
			}else {
				System.out.println("Invalid Characters : "+invalidCharacter);
			}

		}

	}	
}