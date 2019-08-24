import io.pricenton.UnionFind;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of Nodes:");
        int node = inp.nextInt();
        UnionFind unionFind = new UnionFind(node);
        System.out.println("Enter the number of Edges:");
        int edges = inp.nextInt();
        for(int j = 0;j<edges;j++){
            System.out.println("Enter the source node:");
            int source = inp.nextInt();
            System.out.println("Enter the destination node:");
            int dest = inp.nextInt();
            int map[] = unionFind.union(source,dest);
            for(int i = 0;i<map.length;i++){
                System.out.print(map[i]);
            }
            System.out.println();
        }
        System.out.println("**********************************");
        System.out.println("Enter origin node:");
        int origin = inp.nextInt();
        System.out.println("Enter the final node");
        int finalNode = inp.nextInt();
        System.out.println(unionFind.isConnected(origin,finalNode)?"Connected":"Oppss!!Improve your map");
    }
}
