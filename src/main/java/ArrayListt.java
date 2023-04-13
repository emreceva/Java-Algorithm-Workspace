import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {
    public void arrayList(){
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");

        System.out.println(list.size());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Object obj : list){
            System.out.println(obj);
        }

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
