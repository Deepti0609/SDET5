package com.fanniemae.day3;
import java.io.File;
import java.io.IOException;


public class FileProperties {

	public static void main(String[] args) throws IOException {
		//using file class will never create a file		
		File f = new File("test.txt");
		f.createNewFile();
		//boolean flag=f.createNewFile();
		//System.out.println(flag?"Create":"Not Created");
		System.out.println("Can Read  -->  "+ f.canRead());
		System.out.println("Can Write  ---> "+ f.canWrite());
		System.out.println("is this a file  --> "+ f.isFile());
		
	}
}
