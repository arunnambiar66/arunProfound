/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sin.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sin
 *  
 *  Purpose:Sin of taylor series.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.lang.Math;

import java.util.Scanner;

public class Sin 
{
        //variable to control lenght of series
        static int lenghtOfSeries;
        //get an angle from user 
        static double x;
        //variable computes power of x
        static int p=1;
        //assign sign + or -
        static int sign=1;
        //calculate sum of series
        static double sum=0.0;
        //for loop control
        static int i;

    public static void main(String[] args) 
    {
        
        //scan inputs
        Scanner in=new Scanner(System.in);
        System.out.println("Enter lenght of taylor series:");
        lenghtOfSeries=in.nextInt();
        System.out.println("Enter angle:");
        x=in.nextDouble();
        //convert x to be between -2PI to 2PI for precision
        x=x%(2*Math.PI);
        for(i=1;i<=lenghtOfSeries;i++)
        {  //Here fact method is called
            sum+=sign*(Math.pow(x,p)/fact(p));
            sign=-sign;
            p+=2;
        }
        //System.out.println("Sinx:"+sum);
        System.out.println("Sinx="+Math.sin(sum));
    }
    //calculate factorial
   public static int fact(int p)
   {
       int fact=1;
       if(p==0||p==1)
       {
           return 1;
       }
       else
       {
           while(p>0)
           {
               fact+=p;
               p--;
           }
           return fact;
       }
   }
}