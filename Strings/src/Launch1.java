
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Somu");
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println(s1.capacity());
//		s1.append("kisdfkuwdfweugfuywegfuywefuyegfy");
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println(s1.capacity());
//		s1.append(19);
//		s1.append(true);
//		System.out.println(s1);
		
		//s1.insert(4,"king");
		s1.insert(s1.length()," the king");

		System.out.println(s1);		
		s1.delete(5,9);
		System.out.println(s1);		
	}

}
