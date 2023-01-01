package in.sh;

public class Test02 {
	
 public static void main(String[] args) {
	String ss = reveserString("How Are You");
	System.out.println(ss);
}

public  static String reveserString(String s) {
	String[] s1 = s.split(" ");
	int length = s.length();

	
	StringBuffer sb = new StringBuffer();
	
	for(int i = length-1; i>=0; i--) {
		sb.append(s1[i]);
		sb.append(" ");
	}
	
	return sb.toString().trim();
	
}
}
