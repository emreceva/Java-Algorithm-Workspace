import java.util.HashMap;
import java.util.Map;

public class DistinctCharacter {

    public Map<Character, Integer> distinctCharacter(String input){

        char[] chars = input.toCharArray();

        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : chars) {
            if(charsCount.containsKey(c)){
                charsCount.put(c,charsCount.get(c) + 1);
            }else charsCount.put(c,1);
        }
        return charsCount;
    }


}
