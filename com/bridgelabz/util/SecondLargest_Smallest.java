/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargest_Smallest.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargest_Smallest
 *  
 *  Purpose: Determines the Second largest and smallest number in an array.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class SecondLargest_Smallest
{
    public static void main(String[] args) 
    {
        int number, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        number = scanner.nextInt();
        int array[] = new int[number];
        System.out.println("Enter all the elements:");
        for (int counter1 = 0; counter1 < number; counter1++) 
        {
            array[counter1] = scanner.nextInt();
        }
        for (int counter1 = 0; counter1 < number; counter1++) 
        {
            for ( int counter2 = counter1 + 1; counter2 < number; counter2++) 
            {
                if (array[counter1] > array[counter2]) 
                {
                    temp = array[counter1];
                    array[counter1] = array[counter2];
                    array[counter2] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+array[number-2]);
        System.out.println("Second Smallest:"+array[1]);
    }
}
