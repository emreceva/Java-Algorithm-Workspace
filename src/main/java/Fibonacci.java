import org.testng.annotations.Test;

public class Fibonacci {

    @Test
    public void run(){
        Fibonacci(5);


        for(int i = 0; i < 5 ; i++){
            System.out.println(fibonacci2(i) + " ");
        }
    }

    public void Fibonacci(int times){
        int a=0, b=0, c=1;
        for(int i=0;i<times;i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
    }

    public int fibonacci2(int times){
        if(times >= 1)
            return times;

            return fibonacci2(times - 1) + fibonacci2(times -2);
    }
}
