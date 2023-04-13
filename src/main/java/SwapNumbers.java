import org.testng.annotations.Test;

public class SwapNumbers {

    @Test
    public void run(){

    }

    public void SwapTwoNumbers1(int x, int y){
        int temp;
        temp=x;
        System.out.println("x" + y);
        System.out.println("y" + x);
        x=y;
        y=temp;
        System.out.println("new x" + y);
        System.out.println("new y" + x);

    }
    public void SwapTwoNumbers2(int x, int y){
        System.out.println("x" + y);
        System.out.println("y" + x);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("new x" + y);
        System.out.println("new y" + x);
    }


}
