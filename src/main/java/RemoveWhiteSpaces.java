import org.testng.annotations.Test;

public class RemoveWhiteSpaces {
    @Test
    void run(){
        System.out.println(removeWhiteSpaces("Software Testing"));
        System.out.println(removeWhiteSpacesWithoutReplaceMethod("Software Testing"));
        System.out.println(removeWhiteSpaces2("Software Testing"));
        System.out.println(removeWhiteSpaces1("Software Testing"));

    }

    public String removeWhiteSpaces(String str){

        String str2 = str.replaceAll("\\s", "");
        return str2;

    }

    public StringBuffer removeWhiteSpacesWithoutReplaceMethod(String str){

        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<chars.length;i++){
            if((chars[i] != ' ') && (chars[i] !='\t')){
                sb.append(chars[i]);
            }
        }

        return sb;
    }

    public String removeWhiteSpaces1(String input){
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();

        for(char c : charArray){
            if(!Character.isWhitespace(c))
                output.append(c);
        }
        return output.toString();
    }
    public String removeWhiteSpaces2(String input){

        input = input.strip();
        return input.toString();
    }
}
