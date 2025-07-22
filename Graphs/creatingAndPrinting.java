package Graphs;
// GfG: https://www.naukri.com/code360/problems/creating-and-printing_1214551

import java.util.ArrayList;

// TC: O(V + E) 
// SC: O(V + E) 

public class creatingAndPrinting {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] list = (ArrayList<Integer>[]) new ArrayList[n];
 
        for(int i = 0; i < n; i++)
            list[i] = new ArrayList<>();
        
        for(int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
            list[u].add(v);
            list[v].add(u);
        }
        
        
        int[][] result = new int[n][];
        for(int i = 0; i < n; i++){
            list[i].add(0,i);
            int k = list[i].size();
            
            result[i] = new int[k];
            
            for(int j = 0;j < k; j++) 
                result[i][j] = list[i].get(j);
        }
 
        return result;
    }
}
