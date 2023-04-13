public class Palindrome {

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




}
