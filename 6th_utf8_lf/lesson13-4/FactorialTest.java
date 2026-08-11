// FactorialTest.java を修正したプログラムを書く
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int n) {
        int answer = 1;
        for(int i = 0; i < n; i++){
            answer = answer*(i+1);
        }
        return answer;
    }
}
