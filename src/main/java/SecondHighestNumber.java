public class SecondHighestNumber {

    public void secondHighestNumberInArray(int arr[]){

        int largest = 0;
        int secondLargest = 0;

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println("\n Second largest number is : " + secondLargest);
        System.out.println("Largest number is : " + largest);

    }

    public int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
