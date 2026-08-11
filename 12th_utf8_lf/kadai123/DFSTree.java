// 以下に必要な記述を追加せよ

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DFSTree extends Graph{
    DFSTree(String filename){
        super(filename);
    }

      private void dfs(int now, int par, boolean[] visited, int[] parent){

        visited[now] = true;
        parent[now] = par;

        ArrayList<Edge> list = nodes[now].getList();

        for(Edge e : list){

            int next = e.To();

            if(!visited[next]){
                dfs(next, now, visited, parent);
            }
        }
    }

    int [] getDFSTree(int root){
	int[] parent = new int[num];
        Arrays.fill(parent, -1);

        boolean[] visited = new boolean[num];

        dfs(root, root, visited, parent);

        return parent; // 変更すること
    }

    int [] getPath(int start, int end){
	int[] parent = getDFSTree(start);

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

        return ans;
     // 変更すること
    }
}

