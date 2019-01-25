package com.company;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter your height in in inches:");
        int height = userInput.nextInt();

        if (height <= 35)
        {
            System.out.println("Red");
        }
        if (height >= 36 && height < 54)
        {
            System.out.println("Yellow");
        }
        if (height >= 54 && height < 80)
        {
            System.out.println("Green");
        }
        if (height >= 80)
        {
            System.out.println("No Band");
        }


    }
    }
