package com.fanniemae.day3;

import java.util.Comparator;

public class DeviceSortDescName implements Comparator<Device>{

	@Override
	public int compare(Device o1, Device o2) {
		// TODO Auto-generated method stub
		return o2.getdName().compareTo(o1.getdName());
	}
	

	public static Comparator<EmpName> sortDescOnName(){
		return new Comparator <EmpName>(){

			@Override
			public int compare(EmpName e1, EmpName e2) {
				// TODO Auto-generated method stub
				return e2.getName().compareTo(e1.getName());
			};
		
	
	};
}

}
	
			
	
	


