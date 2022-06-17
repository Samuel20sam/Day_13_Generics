package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {
    Scanner input = new Scanner(System.in);
    Integer x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();

    public void checkMax(Integer x1, Integer x2, Integer x3) {
        System.out.println("Max of " + x1 +", " +x2 +" & " +x3 +" is " +Math.max(x3,(Math.max(x1,x2))));
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Generics obj = new Generics();
        obj.checkMax(obj.x1, obj.x2, obj.x3);
    }
}