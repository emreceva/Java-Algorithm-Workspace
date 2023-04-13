public class Fibonacci {

    public void Fibonacci(int times){
        int a=0, b=0, c=1;
        for(int i=0;i<times;i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
    }
}
