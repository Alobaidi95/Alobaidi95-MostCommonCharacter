import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arrayStr = str.toCharArray();
        for(int i = 0 ; i <arrayStr.length; i++)
        {
            if(map.containsKey(arrayStr[i]))
            {
                map.put(arrayStr[i], map.get(arrayStr[i])+1);
            }
            else{
                map.put(arrayStr[i], 1);
            }
        }

        int  highest  = Collections.max(map.values());

        for(int i =0; i < arrayStr.length ; i++)
        {
            if(map.get(arrayStr[i]) == highest)
            {
                return arrayStr[i];
            }
        }
        

        
        return ' ';
    }
}
