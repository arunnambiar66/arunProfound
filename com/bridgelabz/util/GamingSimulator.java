/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/GamingSimulator.java
 *  Execution:    java -cp bin com.bridgelabz.util.GamingSimulator
 *  
 *  Purpose: 
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class GamingSimulator
{ 
   public static void main(String[] args)
   {
        int stake  = Integer.parseInt(args[0]);    // gambler's cash
        int goal   = Integer.parseInt(args[1]);    // gambler's desired cash
        int trials = Integer.parseInt(args[2]);    // number of trials to perform

        int bets = 0;            // total number of bets made
        int wins = 0;           // total number of games won

                                // repeat trials times
        for (int t = 0; t < trials; t++)
        {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) 
            {
                bets++;
                if (Math.random() < 0.5)     
                {
		   cash++;      // wins Rs.1
		}
		else      
		{
		   cash--;      // loses Rs.1
		}              
            }
            if (cash == goal)  // did gambler go achieve desired goal?
            {  
		wins++;               
            }
    }
		               // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        
   
      
    }

}
