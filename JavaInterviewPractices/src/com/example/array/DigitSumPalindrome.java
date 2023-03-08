package com.example.array;

public class DigitSumPalindrome {

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("isPalindrome() ..: "+reverse);
        return num == reverse;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("digitSum() ..: "+sum);
        return sum;
    }

    public static int isDigitSumPalindrome(int N) {
        int sum = digitSum(N);
        if (isPalindrome(sum)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int N = 12341;
        int palindrome = isDigitSumPalindrome(N);
        if (palindrome == 1) {
            System.out.println("Sum of digits of " + N + " is a palindrome.");
        } else {
            System.out.println("Sum of digits of " + N + " is not a palindrome.");
        }
    }
}
