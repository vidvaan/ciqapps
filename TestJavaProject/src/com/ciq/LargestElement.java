package com.ciq;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 35, 42, 17};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest element: " + max);
    }
}
