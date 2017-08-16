/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Stats5.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stats5 
 *  
 *  Purpose: To  prints five uniform random values between 0 and 1, their average value, and their minimum and maximum value.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

//math class for random number
import java.lang.Math;

public class Stats5 
{

    /*variable i to control loop*/
     static int i;
     /*array to store five values*/
     static double array[];
     
    public static void main(String[] args) 
    {
        //initialize array
        array=new double[5];
        /*storing 5 values in array*/
        for(i=0;i<=4;i++)
        {
            array[i]=(Math.random());
        }
        //displaying values
        System.out.println("The random values");
        for(i=0;i<=4;i++)
        {
            
            System.out.println(array[i]);
        }
        System.out.println("The average value:"+(array[0]+array[1]+array[2]+array[3]+array[4])/5);
        System.out.println("The minimum value:"+(Math.min(array[0],Math.min(array[1],Math.min(array[2],Math.min(array[3],array[4]))))));
        System.out.println("The minimum value:"+(Math.max(array[0],Math.max(array[1],Math.max(array[2],Math.max(array[3],array[4]))))));
    }
}