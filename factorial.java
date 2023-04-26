package Lab_1;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// 4:Write a program to find factorial of a given number.
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		n=sc.nextInt();
		int Fact=1;
		for(int i=1; i<n; i++) {
			
			Fact= Fact*i;
			System.out.println("Factorial = "+Fact);
		}
		

	}

}
