import java.io.*;

public class TextToUpperTester {
    public static void main(String[] args) {
        try {
        TextToUpper.readAndConvert("foobar.txt");
        }catch (FileNotFoundException e) {
            System.out.println("エラーだよ。");
            System.out.println(e);
        }
    }
}