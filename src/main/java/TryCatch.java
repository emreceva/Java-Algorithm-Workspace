import org.apache.commons.lang.ObjectUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;

public class TryCatch {

    public void exception(){
        try {
            FileInputStream fis = new FileInputStream("test.txt");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void foo(int x) throws IllegalStateException, NullPointerException {

    }

    static void printString(String s, int count){
        if(s == null) return;
        for(int i = 0; i<count;i++){
            System.out.println(s.toUpperCase());
        }
    }
    public static void main(String[] args) {

        try{
            foo(10);
        }catch (IllegalStateException | NullPointerException e ){
            System.out.println(e.getMessage());
        }
    }


}
