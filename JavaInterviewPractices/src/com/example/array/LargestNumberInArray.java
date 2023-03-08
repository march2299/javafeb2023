package com.example.array;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] array = {3, 5, 1, 9, 2, 7};
		
		LargestNumberInArray largestNumberInArray = new LargestNumberInArray();
		largestNumberInArray.largestNumber(array);
		
		findSecondLargest(array);
		
		findSmallValue(array);
		
		findSecondMinValue(array);
	}
	
	public int largestNumber(int[] array) {
		
		int largestNum = array[0];
		
		for(int  i=0; i<array.length; i++) {
			
			if(array[i] > largestNum ) {
				
				largestNum = array[i];
			}
		}
		
		System.out.println(" Largest number in array is .. : "+largestNum);
		return largestNum;
	}

	
	public static int findSecondLargest(int[] array) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i=0 ; i < array.length; i++) {
			
			if (array[i] > max) {
				
				secondMax = max;
				max = array[i];
				System.out.println("...");
				
			}else if (array[i] > secondMax && array[i] < max) {
				
				secondMax = array[i];
				System.out.println("****");
				
			}
		}
		System.out.println("Second high value is ..: "+secondMax);
		return secondMax;
	}
	
	public static int findSmallValue(int[] array) {
		int min = Integer.MAX_VALUE;
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    System.out.println("Small value in array ..: "+min);
	    return min;
	}
	
	
	public static int findSecondMinValue(int[] array) {
		
		int min_first = Integer.MAX_VALUE;
		int min_second = Integer.MAX_VALUE;;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] < min_first) {
				min_second = min_first;
				min_first = array[i];
			}else if (array[i] < min_second && array[i] > min_first) {
				min_second = array[i];
			}
		}
		System.out.println( " Second min value ..: "+min_second);
		return min_second;
				
	}
}
