package com.example.array;

public class RemoveSpecialCharsAndNumbers {
    public static void main(String[] args) {
        // Example string with special characters and numbers
        String input = "H3llo! H0w ar3 y0u?";
        
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isAlphabetic(c)) {
                output.append(c);
            }
        }
        
        // Print the resulting string
        System.out.println(output.toString());  // Output: HelloHowareyou
    }
}