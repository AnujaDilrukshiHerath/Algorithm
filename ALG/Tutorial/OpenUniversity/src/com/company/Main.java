package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] input)
        {
            String strUpper, strLower;
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter ine word or name in lowercase: ");
            strUpper = scan.nextLine();

            strLower = strUpper.toUpperCase();
            System.out.println("equilent value of UPPERCASE :  " +strLower);
        }
    }


