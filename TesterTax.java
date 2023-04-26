package com.tax;
import java.util.Scanner;
public class TesterTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the Shopkeeper Details..");
		System.out.println("Shopno sname income intrest");
         Shopkeeper s=new Shopkeeper(sc.nextInt(),sc.next(),sc.nextDouble()   );
              s.payTax();
              System.out.println("Enter the interest rate");
             // s.intrest(sc.nextInt());
              System.out.println("Tax="+s.intrest(sc.nextInt()));
              
              System.out.println("Enter the Buisnessman  Details..");
      		System.out.println("bid bname income...");
      		Buisnessman b=new Buisnessman(sc.nextInt(),sc.next(),sc.nextDouble());
      		
      		b.payTax();
      		System.out.println("Enter 5the intrest rate");
            System.out.println("Tax="+b.intrest(sc.nextInt()));*/
            
            System.out.println("Enter the Employee  Details..");
      		System.out.println("ename income");
      		Employee e=new Employee(sc.next(),sc.nextDouble());
      		Employee e1=new Employee(sc.next(),sc.nextDouble());
      		e.payTax();
      		System.out.println("Enter the intrest rate");
            System.out.println("Tax="+e.intrest(sc.nextInt()));
            System.out.println("Tax="+e1.intrest(sc.nextInt()));
           
	}

}
