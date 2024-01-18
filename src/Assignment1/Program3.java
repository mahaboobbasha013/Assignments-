package Assignment1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		int c,rem,arm=0;
		System.out.println("Enter any number");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
	}



}
