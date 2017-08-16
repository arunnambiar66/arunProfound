/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOf2
 *  
 *  Purpose:To takes a command-line argument n and prints a table of the powers of 2 that are less than or equal to 2^n. 
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

/*importing math class for inclusion of math function*/
import java.lang.Math;

public class PowerOf2 
{
    /*variable stores n from user as power */
    static int power;
    /*i control loop flow*/
    static int i;
    
    public static void main(String[] args) 
    {
        /*paraing user input through command line*/
        power=Integer.parseInt(args[0]);
        
        for(i=1;i<=power;i++)
        {
            System.out.println("2^"+i+"="+(int)(Math.pow(2,i)));
        }
    }
}