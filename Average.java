import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
public class Average  
{
	public static double findaverage(List<Integer> l)
	{
		OptionalDouble average = l.stream()
				.mapToInt(Integer::intValue)
				.average();        
		return average.isPresent() ? average.getAsDouble() : 0; 
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter the size of list");
			int n = sc.nextInt();
			List<Integer> l = new ArrayList<Integer>(n);
			System.out.println("Enter the list numbers");
			for(int i = 0; i < n; i++)
				l.add(sc.nextInt());
			System.out.println( "Average: " + findaverage( l ) );
		}
    }
}