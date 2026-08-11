// フィボナッチ数を求めるプログラム（動的計画法版）
import java.util.*;

public class FiboDP{
    public static void main(String[] args){
    int k = Integer.parseInt(args[0]);
    ArrayList<Integer> fibo = new ArrayList<>();
    fibo.add(1);
    fibo.add(1);
    double start = System.nanoTime();
    for(int i = 2; i < k; i++){
        int a = fibo.get(i-2);
        int b = fibo.get(i-1); 
        fibo.add(a+b);
    }
    double end = System.nanoTime();
    double time = (end - start) / 1000000.0;
    System.out.println("Answer:"+fibo.get(k -1));
    System.out.printf("Time: %.6f ms\n", time);
    }
}
