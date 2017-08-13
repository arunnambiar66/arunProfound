/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Binary.java
 *  Execution:    java -cp bin com.bridgelabz.util.Binary
 *  
 *  Purpose: Determines the repeated number in a given array of 100 numbers.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
public class Binary
{
   public static void main(String args[])
   {
      int number=Integer.parseInt(args[0]);
	int power=1;
	
	while(power<=number/2)
	{
	   power=power*2;
	}
	
	while(power>0)
	{
	   if(number<power)
	   {
		System.out.println(0);
	   }
	
	   else
	   {
 		System.out.println(1);
		number=number-power;
	   }
	   power=power/2;
	}
   }
}

