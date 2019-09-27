package weekthree;

public class SampleA {

	public static void method1(){
		SampleA obj = new SampleA();
		obj.method4();
		}
	public static void method2(){
	method1();
	}
	public void method3(){
	method2();
	}
	public void method4(){
		method3();
	}
}

