package com.fanniemae.day2;

import java.util.Arrays;
import java.util.Comparator;

public class PersonSorterTemplate {
	
public static void sortOnIdAsc(Person[] pers) {
	
	Arrays.sort(pers, new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getpId() - o2.getpId();
		}
		
});
}
public static void sortOnIdDsc(Person[] pers) {
	
	Arrays.sort(pers, new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o2.getpId() - o1.getpId();
}
	});
}

}
