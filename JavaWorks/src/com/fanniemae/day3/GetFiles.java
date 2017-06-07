package com.fanniemae.day3;

import java.io.File; // ctl+shft+o will automatically import class

public class GetFiles {
	public static void main(String[] args) {
		File f = new File("Fannie");
		// System.out.println(f.isFile());

		File files[] = f.listFiles();
		
		
		for (File temp : files) {
			// System.out.println(temp.getName());
			boolean f1 = temp.isFile();
			if (f1 == true)
				//// if(temp.isDirectory() == true){
				//// System.out.println("Then its a directory -->"+temp.getName);
				//// }
				// if(temp.isFile() == true){
				System.out.println("Then its a file ---> " + temp.getName());
		}
	}

}
