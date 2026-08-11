// ナップザック問題を解くプログラム
import java.util.*;
import java.io.*;

public class KP {
    public static void main(String[] args) {
    int num, capacity, answer; //データ数,
    int[] weight, value;
    Scanner sc = new Scanner(System.in);

    // ファイルの読み込み
        num = sc.nextInt();
        capacity = sc.nextInt();
        weight = new int[num];
        value = new int[num];

        for (int i = 0; i < num; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        // 必要に応じて内容の確認
        Solver s = new Solver(num, weight, value, capacity);
        answer = s.solve();
        System.out.println(answer);
    }
}
