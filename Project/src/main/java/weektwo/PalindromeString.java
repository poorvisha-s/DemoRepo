package weektwo;

 

import java.util.Scanner;

 

public class PalindromeString {

 

      public static void main(String[] args) {

            // TODO Auto-generated method stub

            @SuppressWarnings("resource")

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the input:");

            String a = sc.next();

            int len = a.length();

            String b = "";

 

            for(int i=len;i>0;i--) {

         b = b+a.charAt(i-1);

            }

            if(a.equals(b))

            {

                  System.out.println("The string is a Palindrome");

            }

            else {

                  System.out.println("The string is NOT a Palindrome");

            }

           

           

      }

 

}