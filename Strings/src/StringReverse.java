import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.next();
		String s2 = " ";
		String s3[] = s1.split("");
		for (String elem : s3) {
			for (int i = elem.length() - 1; i >= 0; i--) {
				s2 = s2 + s1.charAt(i);
			}
			s2 = s2 + " ";
		}
		System.out.println(s2);
//		for (int i = s3.length - 1; i >= 0; i--) {
//			s2 = s2 + s3[i]+" ";
//		}
//		System.out.println(s2);
	}

}
