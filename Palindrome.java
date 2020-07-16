import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Palindrome 
{
	public static List<String> filterStrings(List<String> l)
	{
		List<String> l1 = new ArrayList<String>();
		for(int i = 0; i < l.size(); i++)
		{
			String tempString = (l.get(i)).replaceAll("\\s+", "").toLowerCase();
			 
			boolean check = IntStream.range(0, tempString.length() / 2)
	            .noneMatch(s -> tempString.charAt(s) != tempString.charAt(tempString.length() - s - 1));
			if (check)
				l1.add(l.get(i));
		}
		return l1;
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the size of list");
			int n = sc.nextInt();
			List<String> l = new ArrayList<String>(n);
			System.out.println("Enter the list elements");
			for(int i = 0; i < n; i++)
				l.add(sc.next());
			System.out.println( "Palindromic Strings from the given list of strings are: " + filterStrings(l) );
		}
    }

}