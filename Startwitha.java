import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Startwitha 
{
	public static List<String> filterStrings(List<String> l)
	{
		return l.stream()
				  .filter(str -> str.startsWith("a"))
				  .filter(str -> str.length() == 3)
				  .collect(Collectors.toList());
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
			System.out.println( " Strings starting with the letter 'a' and having exactly 3 letters are: " + filterStrings(l));
		}
    }
}