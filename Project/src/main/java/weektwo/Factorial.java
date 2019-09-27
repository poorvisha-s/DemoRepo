package weektwo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input:");

        int a = sc.nextInt();

        if (a<0) {
        	System.out.println("ERROR!! Enter a positive number");
        }
        else {
int fact=1;

for (int i=1;i<=a;i++) {

  fact=fact*i;

}

System.out.println("Factorial of the value entererd = "+fact);
	}
	}
}
