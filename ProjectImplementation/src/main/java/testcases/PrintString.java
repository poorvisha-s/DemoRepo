package testcases;

import java.util.HashSet;
import java.util.Set;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "poorvisha";
		/*List<String> set1 = new ArrayList<String>();
		for(int i=0;i<s1.length();i++){
			Character ctemp = s1.charAt(i);
			String stemp = ctemp.toString();
				set1.add(stemp);
		}
				System.out.println(set1);
*/
		Set<Character> char1 = new HashSet<Character>();
		for(int i=0;i<s1.length();i++){
			Character ctemp = s1.charAt(i);
				char1.add(ctemp);
		}
		System.out.println(char1);
		
	}

}
