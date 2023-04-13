import org.testng.annotations.Test;

public class Palindrome {


    @Test
    public void run(){
        checkPalindrome("TRT");
        isPalindrome("TRT");
    }
    public boolean isPalindrome(String str) {

        int length = str.length();
        String reverse = "";
        for (int i=length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
            if(str.equals(reverse)){
                System.out.println(str + " is palindrome");
                return true;
            }
        }
        System.out.println(str + " is not palindrome");
        return false;
    }
    public boolean checkPalindrome(String input){
        for(int i = 0; i > input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                System.out.println("is not palindrome");
                return false;
            }
        }
        System.out.println("is palindrome");
        return true;
    }



}
