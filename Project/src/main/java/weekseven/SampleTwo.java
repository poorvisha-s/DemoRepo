package weekseven;

import java.util.HashSet;
import java.util.Set;

public class SampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Set<Integer> int1 = new HashSet<>();
		int1.add(1);
		int1.add(2);
		int1.add(3);
		int1.add(4);
		for (Integer eachint : int1) {
			System.out.println(eachint);
			i++;
			if(i==3){
				break;
			}
		}
		
		

	}

}
