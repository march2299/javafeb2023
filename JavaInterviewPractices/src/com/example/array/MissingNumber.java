package com.example.array;

import java.util.*;

public class MissingNumber {
	public static int findMissingNumber(int[] A) {
	    int n = A.length + 1;
	    int expectedSum = (n * (n + 1)) / 2;
	    int actualSum = 0;
	    for (int i = 0; i < A.length; i++) {
	        actualSum += A[i];
	    }
	    return expectedSum - actualSum;
	}


    public static void main(String[] args) {
    	int[]  arr = {1,2,3,5,6,7} ;
    	int num = findMissingNumber(arr);
    	
    	System.out.println( "Missing number is ..:  "+num);
        }
    }

