import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

    public void HashMapIteration(){
        HashMap<Integer, String> map = new HashMap<Integer,String>();

        map.put(2, "Emre");
        map.put(25, "Istanbul");
        map.put(4, "Turkey");

        System.out.println(map.size());
        Iterator itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is: " + me.getKey() + "Value is : " + me.getValue());

        }
        for(Map.Entry me2 : map.entrySet()){
            System.out.println("Key is : " + me2.getKey() + "Value is : " + me2.getValue());
        }
    }
}
