/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        int age;
        String check, strAge;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age? ");
        strAge = sc.nextLine();

        age = Integer.parseInt(strAge);

        check = (age>=16) ? "true": "false";

        if (check.equals("true")) {
            System.out.println("You are old enough to legally drive.");
        }
        else {
            System.out.println("You are not old enough to legally drive");
        }

    }
}
