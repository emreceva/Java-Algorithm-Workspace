import org.testng.annotations.Test;

public class ArmstrongNumber {

    @Test
    void run(){
        System.out.println(isArmstrong(153));
    }

    public String isArmstrong (int number){


        int c = 0, a, temp;
        temp = number;
        while (number>0){
            a = number % 10;
            number = number / 10;
            c = c + (a*a*a);
        }
        if(temp==c){
            return " is armstrong number";
        }else{
            return  " is not armstrong number ";
        }
    }
}
