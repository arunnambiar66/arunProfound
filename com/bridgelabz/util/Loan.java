/******************************************************************************
 
*Purpose: Finds the Day of the week for the entered Date
 *
 
*  @author  BridgeLabz
 
*  @version 1.0
 
*  @since   08-08-2017
 
*
 ******************************************************************************/


//package com.bridgelabz.util;

/*
*Finds the day of the week
*/


class Loan
 {

	
    public static void main(String[] args)
       {


       //Accepting values from user 
  
          double principle = Integer.parseInt(args[0]); 

          double year = Integer.parseInt(args[1]); 
 
          double rateOfIntreast = Integer.parseInt(args[2]);
 

		//Calculates the numbere of months
     
          double n = 12 * year;


    
	        //Calculates the rate of intrest
   
	  double rof = rateOfIntreast/(12 * 100);

     
		 //calculating the denominator

	
	  double k = 1 + rof;
	
	  double p = Math.pow(k,-n);

		
		//Simplifying the solution into two variables i.e Numerator and Denomintor
    
          double denominator = 1 - p;
   
          double numerator = principle * rof;

    
		//Calculating the loan
  
          double loanPerMonth = numerator/denominator;
	
       	  System.out.println("Rs."+loanPerMonth+" to be paid every month");

       }

 }		