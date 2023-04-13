import org.testng.annotations.Test;

import java.util.Scanner;

public class ReverseString {

    @Test
    public void run(){
        System.out.println(reverse("Software testing"));
    }

    public void reverseStringWithoutUsingStringMethods(String str) {
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        System.out.println("reverse = " + str2);
    }

    public void reverseStringWithoutUsingInbuiltFuncion1(String str){
        char chars[] = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            System.out.println(chars[i]);
        }
    }

    public void reverseStringWithoutUsingInbuiltFuncion2(String str){
        String[] token = str.split("");
        for(int i=token.length;i>=0;i--){
            System.out.println(token[i] + "");
        }
    }
    public void reverseStringWithoutUsingInbuiltFuncion3(String str){
        String reverse = "";
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

    public String reverse(String str){
        if(str == null) throw new IllegalStateException("Null is not valid  input");

        StringBuilder out = new StringBuilder();

        char[] chars = str.toCharArray();
        for(int i = chars.length-1;i>=0;i--)
            out.append(chars[i]);

        return out.toString();
    }


}
