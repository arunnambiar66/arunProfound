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
public class Flip
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many times do you want to toss the coin"):
	int toss=sc.nextInt();


	for(int i=0;i<toss;i++)
        {

          if(Math.random() < 0.5)
	  {
	   System.out.println("Heads");
	  }
         else
	 {
	  System.out.println("tails"); 
	 }
   }
}













