
public class Copystrings {

	public static void main(String[] args) {
		String s1 = new String("KingSomu");
		String s2 = " ";
		System.out.println("Before copy");
		System.out.println(s2);
		for (int i = 0; i < s1.length(); i++) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(" Copied String to " + s2);
	}

}
