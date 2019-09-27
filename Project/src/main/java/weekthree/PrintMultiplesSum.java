package weekthree;

public class PrintMultiplesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		            int sum = 0;
		            for(int i=1;i<100;i++) {
		                  if(i%3==0 | i%5 ==0) {
		                        sum=sum+i;
		                  }
		            }
		            System.out.println("Sum of all the multiples of 3 or 5 less than 100 is: "+sum);

		/*
		Step 1: Initialize sum = 0
		Step 2: For i=1, if i is divisible by 3 or 5 then add i to sum
		Step 3: Repeat the step 2 until i<100
		Step 4: Print sum
		*/
	}
}