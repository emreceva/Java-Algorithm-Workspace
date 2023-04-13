import org.openxmlformats.schemas.wordprocessingml.x2006.main.STCnf;

import java.util.Scanner;

public class PyramidPattern {

    private static void pyramidPattern(int rows){

        for(int i = 1 ;i <= rows; i++){
            int numberOfWhiteSpaces = rows - i;
            printString(" ", numberOfWhiteSpaces);

            printString(i + " " , i);

            System.out.println("");
        }
    }

    private static void printString(String s, int times){
        for(int j=0; j < times ; j++){
            System.out.print(s);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        scanner.close();

        pyramidPattern(rows);
    }

    public static void printPattern2(int rows){

        // for loop for the rows
        for (int i = 1; i <= rows; i++) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            for(int x = 1; x<=i; x++) {
                System.out.print(x+" ");
            }

            //move to next line
            System.out.println("");
        }
    }
    private static void printPattern4(int rows) {
        // for loop for the rows
        for (int i = 1; i <= rows; i++) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = (rows-i)*2;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            for(int j=1; j<=i; j--) {
                System.out.print(j+" ");
            }

            //move to next line
            System.out.println("");
        }
    }
    private static void printPattern5(int rows) {
        // for loop for the rows
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = i*2;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print numbers
            for(int j=0; j<=i; j--) {
                System.out.print(j+" ");
            }

            //move to next line
            System.out.println("");
        }
    }
    private static void printPattern6(int rows) {
        // for loop for the rows
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print character
            printString("* ", i);

            //move to next line
            System.out.println("");
        }
    }

    private static void printPattern7(int rows) {
        // for loop for the rows
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printString(" ", numberOfWhiteSpaces);

            //print character
            printString(i+" ", i);

            //move to next line
            System.out.println("");
        }
    }


}
