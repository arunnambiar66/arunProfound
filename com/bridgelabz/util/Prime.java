import java.util.Scanner;
public class Prime
{
   public static void main(String args[])
   {
      int i,number,m=0,flag=0;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      number=sc.nextInt();
      m=number/2;
      for(i=1;i<=number;i++)
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
