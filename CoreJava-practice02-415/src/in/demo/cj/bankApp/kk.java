/*package in.demo.cj.bankApp;

class kk {
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
 
     calculate count of characters
       in the passed string 
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
 
     The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;
 
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
 
        return index;
    }
 // Driver method
    public static void main(String[] args)
    {
        String str = "aachal";
        int index = firstNonRepeating(str);
 
        System.out.println(
            index == -1
                ? "Either all characters are repeating or string "
                      + "is empty"
                : "First first character that appears exactly once in the string:: "
                      + str.charAt(index));
    }
}*/
/*
import java.util.Scanner;

public class kk
{
	public static void main(String[] args) 
	{
	    //Scanner scan = new Scanner(System.in);
	    
		String name;
		System.out.print("Type String here: ");
		name = scan.next();
		
		String name = "banana";
		
		int nameLength = name.length();
		
		
		for(int i = 0; i < nameLength; i++)
		{
		    if(nameLength.compareTo(name.substring(i + 1, nameLength - 1)))
		    {
		        System.out.print("False");
		    }
		    else
		    {
		        System.out.println("Letter at index: " + i);
		    }
		}
	}
}*/