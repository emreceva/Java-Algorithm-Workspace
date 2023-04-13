import org.testng.annotations.Test;

public class IsPrime {

    @Test
    public void run(){
        System.out.println(isPrime(19));
        System.out.println(isPrime(49));
        System.out.println(isPrime(2));

    }
    public boolean isPrime(int number) {
        int temp;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                System.out.println(number + " is not prime");
                return false;
            }
        }
        System.out.println(number + " is prime");
        return true;
    }

    public boolean isPrime2(int number){
        if(number == 0 || number == 1){
            return false;
        }
        if(number == 2){
            return true;
        }

        for(int i = 2; i<=number/2;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }



}
