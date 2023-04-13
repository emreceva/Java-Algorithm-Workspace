import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public String shuffleArray(int[] arr){
        Random rand = new Random();

        for(int i = 0;i< arr.length;i++){
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;

        }
        return Arrays.toString(arr);
    }

}
