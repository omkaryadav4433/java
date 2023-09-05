import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int num=reader.nextInt();
		
		if(num%2==0) 
			System.out.println("is even number");
			else
				System.out.println("is odd number");
		

	}

}
