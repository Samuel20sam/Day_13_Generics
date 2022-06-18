package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics <T extends Comparable <T>> {
    public T x, y, z;

    public Generics(T x,T y,T z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void testMaximum() {
        Generics.checkMax(this.x,this.y,this.z);
    }

    public static <T extends Comparable<T>> void checkMax(T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println("Max of " +x +", " +y +" & " +z +" is " +max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers");
        Integer i1 = input.nextInt(), i2 = input.nextInt(), i3 = input.nextInt();
        System.out.println("Enter three floats");
        Float f1 = input.nextFloat(), f2 = input.nextFloat(), f3 = input.nextFloat();
        System.out.println("Enter three strings");
        String s1 = input.next(), s2 = input.next(), s3 = input.next();
        new Generics<Integer>(i1,i2,i3).testMaximum();
        new Generics<Float>(f1,f2,f3).testMaximum();
        new Generics<String>(s1,s2,s3).testMaximum();
    }
}