package in.sh;

public class Test01 {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "A";
		
		System.out.println("CompareTo() method:: " +s1.compareTo(s2));  //
		System.out.println("CompareToIgnoreCase() method:: " +s1.compareToIgnoreCase(s2));  //
		
		String s3 = "abcdef";
		String s4 = "abc";
		
		System.out.println(s3.compareTo(s4));
		
		
		String s5 = "Aachal";
		String s6 = "Raja";
		System.out.println(s5.concat(s6));
		System.out.println(s5);
		System.out.println(s6);
		

	}

}
