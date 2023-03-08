package com.example.array;

import java.util.*;

public class SubarraySum {
    public static ArrayList<Integer> findSubarray(int[] arr, int S) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        int left = 0, right = -1; // initialize with -1 in case no subarray is found

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exceeds the target, move left pointer to reduce the window size
            while (sum > S) {
                sum -= arr[left];
                left++;
            }

            // If sum becomes equal to the target, return the indexes
            if (sum == S) {
                right = i;
                break;
            }
        }

        if (right != -1) {
            result.add(left + 1); // Convert 0-based indexing to 1-based indexing
            result.add(right + 1);
        } else {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int S = 12;

        ArrayList<Integer> result = findSubarray(arr, S);

        if (result.get(0) == -1) {
            System.out.println("No subarray found.");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        }
    }
}

