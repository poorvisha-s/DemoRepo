package weektwo;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 2 numbers  to perform arithmetic operation:");
        int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Please enter the operation to be peformed - Add for addition, Sub for subtraction, Mul for multiplication, Div for division:");
		String c = sc.next();
		
		switch (c)
		{
		case "Add" :
		{
			int res = a+b;
			System.out.println("The result of the arithmetic operation is : "+res);
			break;
		}
		case "Sub" :
		{
			int res = a-b;
			System.out.println("The result of the arithmetic operation is : "+res);
			break;
		}
		case "Mul" :
		{
			int res = a*b;
			System.out.println("The result of the arithmetic operation is : "+res);
			break;
		}
		case "Div" :
		{
			int res = a/b;
			System.out.println("The result of the arithmetic operation is : "+res);
			break;
		}
		default:
		{
			System.out.println("ERROR!! Please select valid operation");
			break;
		}
		}
		}
	}

