import java.io.*;
public class PrimeNumber
{
   public static void main(String args[])
   {
      int i,n,ctr=0,j;
      
      for(i=1;i<=10;i++)
      {
        for(j=1;j<=10;j++)
	{
	 if(i%j==0)
	 {
	  ctr++;
	 }
       }
    }

	if(ctr<=2)
	{
	System.out.println("the prime number are"+i);
	}
	
   }
}
