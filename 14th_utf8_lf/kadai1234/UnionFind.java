// UnionFindクラスを書く
public class UnionFind {

    private int[] parent;
    private int[] rank;

    // コンストラクタ
    public UnionFind(int n) {

        parent = new int[n];
        rank = new int[n];

        // 初期化
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }


    // xが属する集合の根を返す
    public int find(int x) {

        // 根の場合
        if (parent[x] == x) {
            return x;
        }

        // 経路圧縮
        parent[x] = find(parent[x]);

        return parent[x];
    }


    // x,yの集合を統合
    public boolean unite(int x, int y) {

        int rx = find(x);
        int ry = find(y);


        // すでに同じ集合
        if (rx == ry) {
            return false;
        }


        // rankが小さい木を大きい木につなぐ
        if (rank[rx] < rank[ry]) {

            parent[rx] = ry;

        } else {

            parent[ry] = rx;


            // rankが同じ場合
            if (rank[rx] == rank[ry]) {
                rank[rx]++;
            }
        }

        return true;
    }
}