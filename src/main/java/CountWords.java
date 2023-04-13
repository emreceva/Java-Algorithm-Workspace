import org.testng.annotations.Test;

import java.util.HashMap;

public class CountWords {

    @Test
    public void run(){
        FinalCountWords("This is is done by by Emre");
    }

    public void FinalCountWords(String str){
        String[] split = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<split.length;i++){
            if(map.containsKey(split[i])){
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }else{
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}
