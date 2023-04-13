import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {


    public void forEach(){
        List<String> list = new ArrayList<>();

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.forEach(System.out::print);
    }


}
