//As a developer, write a program to create an arithmetic calculator.

package PdfAssignmentone;

import java.util.Scanner;

public class CalculatorProgram {
  

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the operands");
		float op1=sc.nextFloat();
		float op2=sc.nextFloat();
		System.out.println("enter the operator");
		char op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			
			System.out.println("The addition of two numbers is "+(op1+op2));
			break;
			
		case '-':
			System.out.println("The differnece between two numbers is "+(op1-op2));
			break;
			
		case '*':
			System.out.println("The multiplication of two numbers is "+(op1*op2));
			break;
			
		case '/':
			System.out.println("The division of two numbers is "+(op1/op2));
			break;
			
		case '%':
			System.out.println("The modulo of two numbers is "+(op1%op2));
			break;
			
		default:
			System.out.println("Please enter a valid opeator...!");
		}
}
}