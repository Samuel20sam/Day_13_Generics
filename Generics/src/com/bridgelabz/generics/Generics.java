package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {
    Scanner input = new Scanner(System.in);

    public void checkMaxInt(Integer x1, Integer x2, Integer x3) {
        System.out.println("Max of " + x1 +", " +x2 +" & " +x3 +" is " +Math.max(x3,(Math.max(x1,x2))));
    }

    public void checkMaxFloat(Float f1, Float f2, Float f3) {
        System.out.println("Max of " + f1 +", " +f2 +" & " +f3 +" is " +Math.max(f3,(Math.max(f1,f2))));
    }
    public static void main(String[] args) {
        Generics obj = new Generics();
        System.out.println("Enter three Integers");
        Integer x1 = obj.input.nextInt(), x2 = obj.input.nextInt(), x3 = obj.input.nextInt();
        obj.checkMaxInt(x1, x2, x3);
        System.out.println("Enter three Floats");
        Float f1 = obj.input.nextFloat(), f2 = obj.input.nextFloat(), f3 =obj.input.nextFloat();
        obj.checkMaxFloat(f1, f2, f3);
    }
}