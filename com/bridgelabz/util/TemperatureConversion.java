/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion
 *  
 *  Purpose: given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class TemperatureConversion 
{        //Variable to store user input as celciis or fareinheit
         static double fareinheit,celcius;
         //store result
         static double result;
         //user input as option
         static int choice;
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1:Fareinheit to Celcius");
        System.out.println("2: Celcius to Fareinheit");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter fareinheit:");
                fareinheit=in.nextInt();
                result=(fareinheit-32)*5/9;
                System.out.println(result+" "+"degree celcius");
                break;
            }
            
            case 2:
            System.out.println("Enter celcius:");
                celcius=in.nextInt();
                result=(celcius*9/5)+32;
                System.out.println(result+" "+"degree fareinheit");
                break;
          
            default:
            {
                System.out.println("Invalid input");
            }
        }
        
    }
}