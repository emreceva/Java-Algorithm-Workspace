import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoArrays {

    public boolean sameElement(Object[] array1 , Object[] array2){

        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));
        if(uniqueElements1.size() != uniqueElements2.size()) return false;

        for(Object obj : uniqueElements1) {
            if(!uniqueElements2.contains(obj)) return false;

        }
        return true;
    }
}
