import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day4Part1 {
	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		try {
			input = Files.readAllLines(Paths.get("C:\\Users\\Tyler\\workspace\\HelpFluffy\\src\\input.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int validCount = 0;
		
		for(String s: input)
		{
			int badcount = 0;
			String[] sub = s.split(" ");
			for(int i = 0; i < sub.length; i++)
			{
				for(int j = 0; j < sub.length; j++)
				{					
					if(sub[i].equals(sub[j]) && i != j)
						badcount++;
				}
				
			}
			if(badcount == 0)
				validCount++;
		}
		
		System.out.println(validCount);
	}
}