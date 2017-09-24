/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.util.StopWatch
 *  
 *  Purpose: Stopwatch
 *
 *  @author  Arun Nambiar
 *  @version 1.0
 *  @since   24-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

class StopWatch
{
	public static long start,stop,elapse;
	public static void start()
	{
	   start=System.currentTimeMillis();
	}
	public static void stop()
	{
	   stop=System.currentTimeMillis();
	   elapse();
	}
	public static void elapse()
	{ 
	   elapse=stop-start;
	}
	public static void showStart()
	{
	   System.out.println(start);
	}
	public static void showStop()
	{
	   System.out.println(stop);
	}
	public static void showElapse()
	{
	   System.out.println("The time elapsed:"+elapse+" milliSeconds");
	}
	public static void main(String args[]){

	start();
	for(int i=0;i<20;i++)
	System.out.println("hello");
	stop();
	showElapse();
	
	}
}
