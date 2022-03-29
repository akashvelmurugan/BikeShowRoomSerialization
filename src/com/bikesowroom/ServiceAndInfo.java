package com.bikesowroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Scanner;

public class ServiceAndInfo {
	public static void customerFeedBack() throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your BikeNumber :");
		String  bikeNumber= scanner.next();
		String upperCase = bikeNumber.toUpperCase();
		
		System.out.println("Enter Your Enter Your Mobile Number:");
		String mobileNumber = scanner.next();
		long currentTimeMillis = System.currentTimeMillis();
		Date date= new Date(currentTimeMillis);
		System.out.println(date);
		
		System.out.println("Thank For You FeedBack");
		FileWriter fileWriter = new FileWriter("D:\\ShowRoom\\FeedBack.txt",true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		PrintWriter printWriter= new PrintWriter(bufferedWriter);
		printWriter.println(upperCase+" "+mobileNumber+" "+date);
		printWriter.close();
	
	}
}
