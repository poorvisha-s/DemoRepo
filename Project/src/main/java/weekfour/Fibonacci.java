package weekfour;
 
import java.util.Scanner;
 
public class Fibonacci {
 
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the series length required: ");
            int len = sc.nextInt();
            System.out.println("The Fibonacci series is:");
            int num1=0;
            int num2=1;
            for(int i=0;i<len;i++){
                  System.out.println(num1);
                  int num3 = num1+num2;
                  num1 = num2;
                  num2 = num3;
            }    
      }
}
 
/*Step 1: Get the length of the series and store in variable len
Step 2: initialize num1 as 0 and num2 as 1
Step 3: for i=0 print num1 and perform:
                num3 = num1+num2;
      num1 = num2;
      num2 = num3;
Step 4: Increment I and repeat the steps until i<len*/