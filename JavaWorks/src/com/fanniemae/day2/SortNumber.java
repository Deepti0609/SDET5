package com.fanniemae.day2;

import java.util.Arrays;

public class SortNumber {

	public static void main(String[] args) {
		int [] nums = {23,69,04,34,56,89,43,78,65,80};
		for (int temp : nums){
			System.out.println(temp);
		}
		Arrays.sort(nums);
		
		System.out.println("-------------------------");
		for(int temp : nums)
			System.out.println(temp);
	}
}
