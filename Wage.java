 import java.util.Scanner;
 public class Wage 
  {    
      public static void main(String[] args) 
      {
        Scanner in = new Scanner(System.in);
		System.out.println("Enter number of hrs");
		int hr = in.nextInt();
		double wage = 0;
		if (hr <= 8)
		{
			wage = hr * 20;
		}
		System.out.println("Daily wage = " + wage);
      }
  }