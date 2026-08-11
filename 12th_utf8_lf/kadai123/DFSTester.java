// DFSTree をテストする
// 課題3

public class DFSTester{
    public static void main(String[] args){

        DFSTree tree = new DFSTree(args[0]);

        int root = 0;

        int[] dfs = tree.getDFSTree(root);

        System.out.println("DFS Tree: root = " + root);

        for(int i = 0; i < dfs.length; i++){

            System.out.print(dfs[i]);

            if(i != dfs.length - 1){
                System.out.print(",");
            }

        }

        System.out.println();

        int start = 150;
        int end = 250;

        int[] path = tree.getPath(start, end);

        System.out.println("Path " + start + " -> " + end);

        if(path == null){

            System.out.println("No Path");

        }else{

            for(int i = 0; i < path.length; i++){

                System.out.print(path[i]);

                if(i != path.length - 1){
                    System.out.print("->");
                }

            }
            System.out.println();
            System.out.println("経路長: " + (path.length - 1));
            System.out.println();

        }
    }
}
