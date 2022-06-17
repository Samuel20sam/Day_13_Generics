package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {
    private void checkMaxInt(Integer x1, Integer x2, Integer x3) {
        System.out.println("Max of " +x1 +", " +x2 +" & " +x3 +" is " +Math.max(x3,(Math.max(x1,x2))));
    }
    private void checkMaxFloat(Float f1, Float f2, Float f3) {
        System.out.println("Max of " +f1 +", " +f2 +" & " +f3 +" is " +Math.max(f3,(Math.max(f1,f2))));
    }
    private void checkMaxString(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0)
            max = s2;
        if (s3.compareTo(max) > 0)
            max = s3;
        System.out.println("Max of strings " +s1 + ", " +s2 + " & " +s3 +" is " +max);
        System.out.println("Max of " + s1 +", " +s2 +" & " +s3 +" is "
                +Math.max(s3.length(),(Math.max(s1.length(),s2.length()))));
    }
    public static void main(String[] args) {
        Generics obj = new Generics();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Integers");
        Integer x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();
        obj.checkMaxInt(x1, x2, x3);
        System.out.println("Enter three Floats");
        Float f1 = input.nextFloat(), f2 = input.nextFloat(), f3 =input.nextFloat();
        obj.checkMaxFloat(f1, f2, f3);
        System.out.println("Enter three Strings");
        String s1 = input.next(), s2 = input.next(), s3 = input.next();
        obj.checkMaxString(s1, s2, s3);
    }
}