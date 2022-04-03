package com.bikesowroom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchBy extends FileLocation{
	Scanner scanner = new Scanner(System.in);
	ArrayList<CustomerDatails> arrayList;
	public void searchByBikeNumber() throws IOException, ClassNotFoundException{
		System.out.println("Enter Your BikeNumber : ");
		String customerBikeNumber = scanner.next();

		File file = new File(FileLocation.location());
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		arrayList = (ArrayList<CustomerDatails>) objectInputStream.readObject();

		boolean noData=false;
		for (CustomerDatails customerDatails : arrayList) {
			if (customerDatails.getBikeNumber().equalsIgnoreCase(customerBikeNumber)) {
				System.out.println("CustomerName : "+customerDatails.getCustomerName());
				System.out.println("CustomerMobileNumber : "+customerDatails.getMobile());
				System.out.println("CustomerAge : "+customerDatails.getCustomerAge());
				System.out.println("BikeModel : "+customerDatails.getBikeModel());
				System.out.println("BikeNumber : "+customerDatails.getBikeNumber());
			noData = true;
			}
		}
		if (noData==false) {
			System.out.println("No Data");
		}
		fileInputStream.close();
		objectInputStream.close();
	}
	public void searchByMobileNumber() throws IOException, ClassNotFoundException{
		System.out.println("Enter Your Mobile Number : ");
		String customerMobileNumber = scanner.next();

		File file = new File(FileLocation.location());
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		arrayList = (ArrayList<CustomerDatails>) objectInputStream.readObject();

		boolean noData=false;
		for (CustomerDatails customerDatails : arrayList) {
			if (customerDatails.getMobile().equalsIgnoreCase(customerMobileNumber)) {
				System.out.println("CustomerName : "+customerDatails.getCustomerName());
				System.out.println("CustomerMobileNumber : "+customerDatails.getMobile());
				System.out.println("CustomerAge : "+customerDatails.getCustomerAge());
				System.out.println("BikeModel : "+customerDatails.getBikeModel());
				System.out.println("BikeNumber : "+customerDatails.getBikeNumber());
				noData=true;
			}
		}
		if (noData==false) {
			System.out.println("No Data");
		}
		fileInputStream.close();
		objectInputStream.close();
	}
}

