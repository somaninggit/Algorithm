import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=" ";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					s3=s3+s1.charAt(i);
				}
			}
		}
		System.out.println(s3);
	}

}
