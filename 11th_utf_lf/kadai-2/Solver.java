// ナップザック問題を解くプログラム
public class Solver{
    int n, capacity, answer;
    int[] weight, value;
    // コンストラクタ
    public Solver(int n, int[] weight, int[] value, int capacity) {
        this.n = n;
        this.weight = weight;
        this.value = value;
        this.capacity = capacity;
    }
   public int solve() {

    int[][] T = new int[n + 1][capacity + 1];
    for (int i = 0; i <= n; i++) {
        for (int k = 0; k <= capacity; k++) {
            T[i][k] = 0;
        }
    }
    for (int i = 1; i <= n; i++) {
        for (int k = 0; k <= capacity; k++) {
            if (k < weight[i - 1]) {
                T[i][k] = T[i - 1][k];
            } else {
                T[i][k] = Math.max(T[i - 1][k],T[i - 1][k - weight[i - 1]] + value[i - 1]);
            }

        }
    }

    return T[n][capacity];
}
}
