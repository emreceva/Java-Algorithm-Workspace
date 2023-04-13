public class MergeSort {

    public static void main(String[] args) {

        int[] arr = { 70, 50, 30, 10, 20, 40, 60 };

        int[] merged = mergeSort(arr, 0, arr.length - 1);

        for(int val : merged){
            System.out.println(val + " ");
        }
    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two){
        int[] sorted = new int[one.length + two.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < one.length && j < two.length) {
            if(one[i] < two[j]) {
                sorted[k] = one[i];
                k++;
                i++;
            }else {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if(i == one.length){
            while (j < two.length){
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if(j == two.length) {
            while(i< one.length){
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;

    }
    public static int[] mergeSort(int[] arr, int low, int high){
        if(low == high){
            int[] br = new int[1];
            br[0] = arr[0];

            return br;
        }

        int mid = (low + high) / 2;
        int[] fh = mergeSort(arr, low, mid);
        int[] sh = mergeSort(arr, mid + 1, high);
        int[] merged = mergeTwoSortedArrays(fh, sh);

        return merged;

    }

}
