import java.util.List;

public class OddNumbers {

    public boolean onlyOddNumbers(List<Integer> list){
        for(int i : list){
            if(i % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public boolean onlyOddNumbers2(List<Integer> list){

        return list.parallelStream()
                .anyMatch(x -> x %2 !=0);
    }
}
