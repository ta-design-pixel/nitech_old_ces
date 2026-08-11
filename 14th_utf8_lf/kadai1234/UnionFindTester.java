// mainメソッドを含むUnionFindTesterクラスを書く
// UnionFindTesterクラスのfindメソッドとuniteメソッドをテストする
// 課題3でmainメソッドを実行するクラス
public class UnionFindTester {

    public static void main(String[] args) {

        UnionFind uf = new UnionFind(5);


        System.out.println("初期状態");

        for(int i = 0; i < 5; i++) {
            System.out.println(
                i + " -> " + uf.find(i)
            );
        }


        System.out.println("\nunion 0,1");

        uf.unite(0,1);


        System.out.println("union 1,2");

        uf.unite(1,2);


        System.out.println("\nfind結果");

        for(int i = 0; i < 5; i++) {

            System.out.println(
                i + " -> " + uf.find(i)
            );
        }


        System.out.println("\n同じ集合か確認");

        System.out.println(
            uf.unite(0,2)
        );

        System.out.println(
            uf.unite(3,4)
        );
    }
}

