package com.example.array;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int evenSum =0;
		int oddSum = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 0) {
				evenSum += arr[i];
			}
			
		}
		System.out.println("Addition of even Sum is "+evenSum);
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 1) {
				oddSum += arr[i];
			}
			
		}
		System.out.println("Addition of even odd Sum is "+oddSum);
	}

}
