/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt
 *  
 *  Purpose: Computes the square root of a nonnegative number c using Newton's method.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   15-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
public class Sqrt
 { 
    public static void main(String[] args)
    { 

        // read in the command-line argument
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }

}