package com.bikesowroom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dummy {
	public static void main(String[] args) throws IOException {
		 FileOutputStream fileOutputStream = new FileOutputStream(FileLocation.location());
	        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	        ArrayList<CustomerDatails> arrayList = new ArrayList<CustomerDatails>();
	        objectOutputStream.writeObject(arrayList);
	        objectOutputStream.flush();
	        fileOutputStream.close();
	        objectOutputStream.close();
	}
}
