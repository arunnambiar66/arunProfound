/******************************************************************************
 
*  Purpose: Finds the Day of the week for the entered Date
 *
 
*  @author  BridgeLabz

 *  @version 1.0

 *  @since   08-08-2017
 *
 
******************************************************************************/


package com.bridgelabz.util;

/*
*Finds the day of the week
*/


class Day 
{

	
public static void main(String[] args)
 {


   
    //Accepting values from user
 
      int date = Integer.parseInt(args[0]); 
    
   int month = Integer.parseInt(args[1]); 
  
     int year = Integer.parseInt(args[2]); 

	
	//Calculates the year
	
	int y = year - (14 - month)/12;

	
	//Checks for leap Year
	
	int x = y + (y/4) - (y/100) + (y/400);

	
	//Checks for month
	
	int m = month + 12 * ((14 - month) / 12) - 2;

	
	//Checks the value associated with Day i.e from 0 to 6 
	
	int day = (date + x + (31 * m)/12)%7;

		
	
	//Prints the day
        if (day == 1)
		
	System.out.println("The day is Monday");


	    else if (day == 2)
		
	System.out.println("The day is Tuesday");

	
    else if (day == 3)
	
	System.out.println("The day is Wednesday");


	    else if (day == 4)
		
System.out.println("The day is Thrusday");

	
    else if (day == 5)
		
System.out.println("The day is Friday");

	
    else if (day == 6)
		
System.out.println("The day is Saturday");

	
    else
		
System.out.println("The day is Sunday");

	}

}		