package weekthree;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of Armstrong numbers between 100 and 1000 is:");
        for(int i=100;i<=1000;i++) {
              int a = i;
              int b = 0;
              while (a>0) {
                    int q = a/10;
                    int r = a%10;
                    a = q;
                    b = b + (r*r*r);
                    }
              int arm = b;
              if(i==arm) {
                    System.out.println(i);
              }
              }
	}
}
