// フィボナッチ数列を求めるプログラム（再帰法版）
public class FiboRec{
    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args){
    int k = Integer.parseInt(args[0]);
    double start = System.nanoTime();
    int answer = fibo(k);
    double end = System.nanoTime();
    double time = (end - start) / 1000000.0;
    System.out.println("Answer:"+answer);
    System.out.printf("Time: %.6f ms\n", time);
    }
}
