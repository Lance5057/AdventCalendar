import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day5Part1 {
	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		List<Integer> jumps = new ArrayList<Integer>();
		try {
			input = Files.readAllLines(Paths.get("C:\\Users\\Tyler\\workspace\\HelpFluffy\\src\\input.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String s: input)
		{
			jumps.add(Integer.parseInt(s));
		}
		
		int i = 0;
		int count = 0;
		Integer[] jumpsArray = new Integer[jumps.size()];
		jumpsArray = jumps.toArray(jumpsArray);
		
		while(i < jumps.size())
		{
			int cur = i;
			i+=jumpsArray[cur];
			
			count++;
		}
		
		System.out.println(count);
	}
}