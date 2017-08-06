import java.util.Scanner;
public class Prime
{
   public static void main(String args[])
   {
      int i,number,m,flag=0;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      number=sc.nextInt();
      m=number/2;

	if(number<2)
	{
	System.out.println(number +"\tnot a prime number");
	}

	else
	{

       for(i=2;i<=m;i++)
       {
 	if(number%i==0)
         {
            System.out.print(number+ "\tis not a prime number");
 	    flag=1;
            break;
         }
      }

      if(flag==0)
      {
         System.out.print(number+ "\tis a prime number");
      }
  }

   }

}
  

