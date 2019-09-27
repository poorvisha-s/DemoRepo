package weektwo;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the input:");

        int a = sc.nextInt();

    int num = a;

        int b = 0;
       
        while (a>0) {

        int q = a/10;

        int r = a%10;

        a = q;

        b = (b*10)+r;

        }

        int num_rev = b;

        if(num==num_rev) {

              System.out.println("The number is a Palindrome");

        }

        else {

              System.out.println("The number is NOT a Palindrome");

        }

	}

}
