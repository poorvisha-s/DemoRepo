package weekfour;
 
import java.util.Scanner;
 
public class PrintPyramid {
 
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the character to form a pyramid");
            String pyramidchar = sc.next();
            for(int i=0;i<5;i++){
                  for(int j = 0;j<=i;j++) {
                        System.out.print(pyramidchar);
                  }
                  System.out.println();
            }          
      }
}