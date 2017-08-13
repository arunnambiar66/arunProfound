/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RollDie.java
 *  Execution:    java -cp bin com.bridgelabz.util.RollDie
 *  
 *  Purpose: 
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;

public class RollDie
{
   public static void main(String args[])
   {
	int random=0,i=0,roll_time;
	int array[]={1,2,3,4,5,6};
        int arr[]=new int[6];


	Scanner sc=new Scanner(System.in);
	System.out.println("How many times do you want to roll the dice");
	roll_time=sc.nextInt();

	for(i=0;i<roll_time;i++)
	{
	   random=1+(int)(Math.random()*6);
	   System.out.println(random);
	}
	
	
   }
}
	   

	
