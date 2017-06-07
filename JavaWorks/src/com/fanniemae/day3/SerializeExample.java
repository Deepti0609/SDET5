package com.fanniemae.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.fanniemae.day2.Person;

public class SerializeExample {
	
	public static void storeObject(Person per){
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			
			oos.writeObject(per);
			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
				oos.close();
			}catch(IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				System.out.println("Data Saved Successfully");
			}
		
	public static void  readObject() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
		
		Person person = (Person)ois.readObject();
		System.out.println(person);
		
	}

	public static void main(String[] args) {
		
		//Person p = new Person(101,"Deepti",1212123); // if we need to go to another class(here is Person class) use ctrl+click
		//storeObject(p);
		
		try {
			readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
