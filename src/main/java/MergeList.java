import java.util.ArrayList;
import java.util.List;

public class MergeList {

    public List<String> mergedList(List<String> list1, List<String> list2){
        List<String> mergedList = new ArrayList<>(list1);

        mergedList.addAll(list2);

        return mergedList;
    }
}
