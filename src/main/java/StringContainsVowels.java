import org.testng.annotations.Test;

public class StringContainsVowels {



    @Test
    public void run(){
        System.out.println(stringContainsVowels("Software Testing"));
    }
    public boolean stringContainsVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
