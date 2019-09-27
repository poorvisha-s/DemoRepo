package weekthree;

import java.util.Scanner;

public class PrintSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input to calculate the sum:");
        int a;
        int sum = 0;
do {
  a = sc.nextInt();
  sum = sum + a;
} while (a!=0);
System.out.println("The sum of the numbers entered is: "+sum);
	}

}
