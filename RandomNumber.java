package com.umesh;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Umesh on 2/10/2015.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number1=randomNumberGeneretor();
        int Number2=randomNumberGeneretor();
        System.out.println("Random number are: ");
        System.out.println("Number1="+Number1);
        System.out.println("Number2="+Number2);
        int actualAnswer=Number1*Number2;
        System.out.println("Enter the answer of Number1*Number2=");
        int answer=input.nextInt();
        if(answer == actualAnswer)
            System.out.println("Congratulation!! You are intelligent.. :P");
            else
            System.out.println("Study harder!!");

    }
    static int randomNumberGeneretor()
    {
        int randomnumber=0;
        Random rand=new Random();
        randomnumber=rand.nextInt(9);
        return randomnumber;
    }
}
