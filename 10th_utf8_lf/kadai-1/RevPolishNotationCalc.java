// 課題1のプログラムRevPolishNotationCalcクラスを作成する
import java.util.*;

class RevPolishNotationCalc {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner stdIn = new Scanner(System.in);

        while (stdIn.hasNext()) {
            String token = stdIn.next();

            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        System.out.println("Answer:" + stack.pop());
    }
}