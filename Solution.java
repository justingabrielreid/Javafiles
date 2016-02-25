import java.util.List;
import java.util.ArrayList;
public class Solution {
    public ArrayList<String> findRepeatedDnaSequences(String s) 
    {
        ArrayList<String> sequence = new ArrayList<String>();
        int matches;
        ArrayList<String> matchedSequence = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++)
        {
            if (i + 9 > s.length())
            {
				sequence.add(s.substring(i, i + 9));
			}
            
        }
        for(int i = 0; i < sequence.size(); i++)
        {
			matches = 0;
				for (int j = 1; j < sequence.size(); j++)
				{
					if(sequence.get(i) == sequence.get(i))
					{
						matches++;
						System.out.print(matches);
						matchedSequence.add(sequence.get(i));
					}
				}
		}
		return matchedSequence;
    }
}
