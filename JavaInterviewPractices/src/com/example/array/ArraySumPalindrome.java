package com.example.array;

public class ArraySumPalindrome {

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            System.out.println(reverse);
            temp /= 10;
        }
        return num == reverse;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,1 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        System.out.println("Sum of array .. " + sum);
        boolean palindrome = isPalindrome(sum);
        if (palindrome) {
            System.out.println("Sum of array elements is a palindrome.");
        } else {
            System.out.println("Sum of array elements is not a palindrome.");
        }
    }
}

