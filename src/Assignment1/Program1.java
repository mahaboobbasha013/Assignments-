package Assignment1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number=scanner.nextInt();
		if(number%2==0) {
			System.out.println("Given number is even");
	    }else {
	        System.out.println("Given number is odd");
		scanner.close();
	}
	}
}
