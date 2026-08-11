// BFSTree をテストする
// 課題2

public class BFSTester {

    public static void main(String[] args) {

        BFSTree tree = new BFSTree(args[0]);

        int root = 0;

        int[] bfs = tree.getBFSTree(root);

        System.out.println("BFS Tree: root = " + root);

        for (int i = 0; i < bfs.length; i++) {
            System.out.print(bfs[i]);

            if (i != bfs.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        int start = 0;
        int end = 200;

        int[] path = tree.getShortestPath(start, end);

        System.out.println("Shortest Path " + start + " -> " + end);

        if (path == null) {

            System.out.println("No Path");

        } else {

            for (int i = 0; i < path.length; i++) {

                System.out.print(path[i]);

                if (i != path.length - 1) {
                    System.out.print("->");
                }

            }

            System.out.println();

        }
    }
}
