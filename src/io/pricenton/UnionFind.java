package io.pricenton;

public class UnionFind {
    int id[];
    public UnionFind(int n){
        id = new int[n];
        for(int i = 0;i<n;i++){
            id[i] = i;
        }
    }

    public int[] union(int source, int destination){
        int src = id[source];
        int dest = id[destination];
        id[source] = dest;
        for(int j = 0;j<id.length;j++){
            if(id[j]==src){
                id[j] = dest;
            }
        }
        return id;
    }

    public boolean isConnected(int source, int destination){
        return id[source]==id[destination];
    }

}
