
public class Laynch2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(1000);
		System.out.println(sb.capacity());
		//StringBuffer s1=sb.append("sachin");
		System.out.println(sb.append("sachin"));
		System.out.println(sb.capacity());
		System.out.println();
		StringBuffer s1=new StringBuffer("King");
		s1.append("somu").
			insert(7,"cheeli").
			reverse().
			insert(s1.length(),"always").append("raganar");
		System.out.println(s1);
			
		
	}

}
