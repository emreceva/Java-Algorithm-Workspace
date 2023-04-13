public class IsPrime {


    public boolean isPrime(int number) {
        int temp;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                System.out.println(number + " is prime");
                return false;
            }
        }
        System.out.println(number + " is not prime");
        return false;
    }



}
