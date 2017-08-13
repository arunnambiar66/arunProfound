/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Flip.java
 *  Execution:    java -cp bin com.bridgelabz.util.Flip
 *  
 *  Purpose: flipping of coin and display heads or tails and percentage
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class Flip
{
   public static void main(String[] args)
   {
	int toss;
        int heads=0,tails=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many times do you want to toss the coin");
	toss=sc.nextInt();


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
	
	if(toss==heads)
	{
	   System.out.println("HEADS HEADS HEADS");
        }
	   
   }
}













