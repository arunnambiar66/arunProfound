/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose: To print the names in reverse order.
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class PrintThreeNames
{
	
	public static void main(String args[])
	{
		
	/*
	* Accept three strings from user
	*/
	String S1 =args[0];
	String S2 =args[1];
	String S3 =args[2];
		
	/*
	* Print string in reverse format
	*/
	System.out.println("Hi\t"+S3+"\t "+S2+"\t"+S1);
	}
}
