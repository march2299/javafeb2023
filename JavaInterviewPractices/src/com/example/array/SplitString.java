package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
        String input = "016-789-67";
        String[] output = splitString(input, "-");
        System.out.println(Arrays.toString(output));
    }

    public static String[] splitString(String input, String delimiter) {
        List<String> output = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == delimiter.charAt(0)) {
                output.add(builder.toString());
                builder = new StringBuilder();
            } else {
                builder.append(input.charAt(i));
            }
        }
        output.add(builder.toString());
        return output.toArray(new String[output.size()]);
    }
}

