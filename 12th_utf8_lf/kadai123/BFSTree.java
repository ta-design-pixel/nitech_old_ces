// 以下に必要な記述を追加せよ

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTree extends Graph{

     BFSTree(String filename){
        super(filename);
    }
    
    int [] getBFSTree(int root){
	int[] parent = new int[num];
        Arrays.fill(parent, -1);

        boolean[] visited = new boolean[num];

        Queue<Integer> queue = new LinkedList<>();

        visited[root] = true;
        parent[root] = root;
        queue.offer(root);

        while(!queue.isEmpty()){

            int now = queue.poll();

            ArrayList<Edge> list = nodes[now].getList();

            for(Edge e : list){

                int next = e.To();

                if(!visited[next]){

                    visited[next] = true;
                    parent[next] = now;
                    queue.offer(next);

                }

            }

        }

        return parent;
     // 変更すること
    }

    int [] getShortestPath(int start, int end){
	int[] parent = getBFSTree(start);

        if(parent[end] == -1){
            return null;
        }

        ArrayList<Integer> path = new ArrayList<>();

        int cur = end;

        while(cur != start){

            path.add(cur);
            cur = parent[cur];
        }

        path.add(start);

        Collections.reverse(path);

        int[] ans = new int[path.size()];

        for(int i = 0; i < path.size(); i++){
            ans[i] = path.get(i);
        }

        return ans; // 変更すること
    }
}
