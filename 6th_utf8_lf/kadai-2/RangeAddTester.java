// RangeAddTester クラス
import java.util.Scanner;

class NotNaturalNumber extends RuntimeException{
    NotNaturalNumber(int n){ super("自然数ではない："+ n);}
}

class RangeAdd {

    public static int add(int a, int b) throws NotNaturalNumber {
        if (a < 0) {
            throw new NotNaturalNumber(a);
        } else if (b < 0) {
            throw new NotNaturalNumber(b);
        } else {
            int start = Math.min(a, b);
            int end = Math.max(a, b);
            int count = end - start + 1;
            return (start + end) * count / 2;
        }
    }
}

public class RangeAddTester {
public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
int a = 1;System.out.println("整数a："+a); 
int b = 10;System.out.println("整数b："+b); 
try {
System.out.println("結果は"+RangeAdd.add(a, b)+"です。");
} catch (NotNaturalNumber e) {
System.out.println("エラーです。"+e.getMessage());
}
 a = -1;System.out.println("整数a："+a); 
 b = 10;System.out.println("整数b："+b); 
try {
System.out.println("結果は"+RangeAdd.add(a, b)+"です。");
} catch (NotNaturalNumber e) {
System.out.println("エラーです。"+e.getMessage());
}
 a = 10;System.out.println("整数a："+a); 
 b = 10;System.out.println("整数b："+b); 
try {
System.out.println("結果は"+RangeAdd.add(a, b)+"です。");
} catch (NotNaturalNumber e) {
System.out.println("エラーです。"+e.getMessage());
}
}
}