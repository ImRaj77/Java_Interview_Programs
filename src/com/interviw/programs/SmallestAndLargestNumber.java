package com.interviw.programs;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {10, 90, 0, -24, 50, -88, 98756};
		int largest = numbers[0];
		int smallest = numbers[0];
		// Time Complexity O(n)
		for(int i=1; i< numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			} else if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("given array is : "+Arrays.toString(numbers));
		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is : "+smallest);
	}
}
