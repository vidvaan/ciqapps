package com.ciq;
public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " is Armstrong: " + isArmstrong(num));
    }
}
