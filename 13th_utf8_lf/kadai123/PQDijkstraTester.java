// PQDijkstraTester をテストする

public class PQDijkstraTester {

    public static void main(String[] args) {
        PQDijkstra pqd = new PQDijkstra(args[0]);
        int startNode = 0;
        int[] parent = pqd.doDijkstra(startNode);
        System.out.println("PQ使用: 始点 " + startNode + " からの最短経路木:");
        for (int endNode = 0; endNode < pqd.getNumNodes(); endNode++) {
            int[] path = pqd.getShortestPath(startNode, endNode);
            System.out.print("end = " + endNode + ": ");
            if (path.length == 0) {
                System.out.println("到達不能");
            } else {
                for (int i = 0; i < path.length; i++) {
                    System.out.print(path[i] + (i == path.length - 1 ? "" : ", "));
                }
                System.out.println();
            }
        }
    }
} 

