package weekseven;

public class SampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=9;j>0;j--){
			for(int i=j;i>0;i--){
				System.out.print(i+" ");
			}
			for(int i=2;i<=j;i++){
				System.out.print(i+" ");
			}
			System.out.println(" ");
			for(int x=j;x<=9;x++){
				System.out.print("  ");
			}
		}
	}
}