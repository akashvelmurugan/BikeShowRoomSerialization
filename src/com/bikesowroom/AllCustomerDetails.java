package com.bikesowroom;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AllCustomerDetails {
	Scanner scanner = new Scanner(System.in);
	public void passWordVerfication() throws ClassNotFoundException, IOException{
		while(true) {
			System.out.println("Enter Your Password :");
			String password=scanner.next();
			if(password.equals("password")) {
				allCustomerDetails();
				break;
			}else {
				System.out.println("You Entered Wrong Password !!!!!!!");
			}
		}
	}
	public static void allCustomerDetails() throws IOException, ClassNotFoundException { 

		File file = new File(FileLocation.location());
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<CustomerDatails> arrayList = (ArrayList<CustomerDatails>) objectInputStream.readObject();

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("CustomerName : "+arrayList.get(i).getCustomerName());
			System.out.println("CustomerMobileNumber : "+arrayList.get(i).getMobile());
			System.out.println("CustomerAge : "+arrayList.get(i).getCustomerAge());
			System.out.println("BikeModel : "+arrayList.get(i).getBikeModel());
			System.out.println("BikeNumber : "+arrayList.get(i).getBikeNumber());
		}
		objectInputStream.close();
		fileInputStream.close();
	}
}