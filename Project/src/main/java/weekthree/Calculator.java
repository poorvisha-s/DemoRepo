package weekthree;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		int x = obj.Addition(10, 90);
		int y = obj.Addition(12, 13, 15);
		obj.Subtraction(x, y);
	}
	public int Addition(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
	public int Addition(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
		return sum;
	}
	public int Subtraction (int a, int b)
	{
		int diff = a-b;
		System.out.println(diff);
		return diff;
	}
	}
	
