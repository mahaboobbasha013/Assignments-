package Assignment1;

import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks=scanner.nextInt();
	if(marks<35) 
		System.out.println("Student is faild");
	else if(marks==35)
		System.out.println("Student is just pass");
	else if(marks>35&&marks<70)
		System.out.println("Student is third class");
	else if(marks>=70&&marks<85)
		System.out.println("Student is second class");
	else
		System.out.println("Student is first class");
	
}
}
