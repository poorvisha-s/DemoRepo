package weekfour;
 
public class FindDuplicate {
 
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            int[] a = {13,15,67,88,65,13,99,67,65,87,13};
            int[] b = {0,0,0,0,0,0};
            int x=0;
            for(int i=0;i<a.length;i++){
                  for(int j=i+1;j<a.length;j++){
                        if(a[i]==a[j]){
                        	b[x] = a[i];
                        	x=x+1;
                             // System.out.print(a[i]+" ");
                              break;
                        }
                  }
            }
            for(int p=0;p<b.length;p++){
            	System.out.print(b[p]+" ");
            }
 
      }
 
}
 

