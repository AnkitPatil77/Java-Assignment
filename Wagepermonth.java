 import java.util.Scanner;
 public class Wagepermonth
  {    
      public static void main(String[] args) 
      {
        Scanner in = new Scanner(System.in);
		System.out.println("Enter number of working days");
		int days = in.nextInt();
		double wage = 0;
		if (days <= 20)
		{
			wage = days * 160;
		}
		System.out.println("Monthly wage = " + wage);
      }
  }