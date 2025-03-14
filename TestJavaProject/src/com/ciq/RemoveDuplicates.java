package com.ciq;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (set.add(ch)) result.append(ch);
        }
        
        System.out.println("String after removing duplicates: " + result);
    }
}
