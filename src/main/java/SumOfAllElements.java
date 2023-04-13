import org.testng.annotations.Test;

public class SumOfAllElements {


    @Test
    public void run(){
        int[] arr1 = {1,3,4};
        System.out.println(sumOfInteger(arr1));
    }

    public int sumOfInteger(int[] arr){
        int sum = 0;
        for (int i: arr){
           sum += i;
        }
        return sum;
    }
}
