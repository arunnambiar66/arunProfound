/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RepeatedNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.RepeatedNumber
 *  
 *  Purpose: Determines the repeated number in a given array of 100 numbers.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class RepeatedNumber{
  		public static void main(String[] args){
		        //Scanner class for accepting the input
	     		
			Scanner scanner=new Scanner(System.in);			
			
			//initialise the array for accepting 100 integers
			int array[]=new int[10];	

			//initialise the variables for storing the repeated number and its locations			
	       		int i,j,RepeatedNumber=0;
	     
			//Initialise for loop for storing 100 integers in an array
			for(i=0;i<10;i++)  					
	     		{
  	       		   array[i]=scanner.nextInt(); 
         	        }

			//checking the repeated number in an array
	       	        for(i=0;i<10;i++)					
	     		{
	      		   for(j=i+1;j<10;j++)
	      		   {
 		  		if(array[i]==array[j])				
		  		{
                   		RepeatedNumber=array[i];			
		   		
		  		}
	      		   }
	  	 	}
                	System.out.println("The repeated no is "+RepeatedNumber);

 		}
}
