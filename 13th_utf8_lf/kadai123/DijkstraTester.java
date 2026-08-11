// Dijkstra をテストする

public class DijkstraTester {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java DijkstraTester <filename>");
            return;
        }

        Dijkstra d = new Dijkstra(args[0]);
        int startNode = 0; 
        int[] parent = d.doDijkstra(startNode);
        
        System.out.println("始点 " + startNode + " から各ノードへの最短経路:");
        for (int endNode = 0; endNode < d.getNumNodes(); endNode++) {
            int[] path = d.getShortestPath(startNode, endNode);
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