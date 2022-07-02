 import java.util.Scanner;
  public class Employee7 
  {    
      public static void main(String[] args) 
      {
          Scanner input = new Scanner( System.in);
          WageCalcu employee = new WageCalcu();

          String name = input.nextLine();
          

          System.out.print( "Enter how many hours worked: " );
          int hours = input.nextInt();

          System.out.print( "Enter hourly days: " );
          double rate = input.nextInt();

          employee7.calculatePay( hours, days );
          employee7.displayEmployee();

          System.out.println();

      }
  }