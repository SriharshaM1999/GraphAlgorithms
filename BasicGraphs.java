import java.util.*;

public class BasicGraphs{

    public static void addEdges( int graph[][], int val, int v, int e){
        for(int i=0;i<=v;i++){
            for(int j=0;j<=e;j++){
                graph[i][j] = val;
            }
        }
        graph[1][2]=1;
        graph[2][1]=1;

        graph[3][2]=1;
        graph[2][3]=1;

        graph[3][4]=1;
        graph[4][3]=1;

        graph[4][1]=1;
        graph[1][4]=1;

        graph[2][5]=1;
        graph[5][2]=1;

        graph[3][5]=1;
        graph[5][3]=1;

    }

    public static void dfs(int graph[][], int start, int e, boolean [] visited ){


        visited[start] = true;
        System.out.println(start);

        for(int i=0;i<=e;i++){
                if(i==start) continue;
            if(visited[i]==false && graph[start][i]==1){
                dfs(graph, i, e, visited);
            }

        }



    }

    public static void main(String[] args) {


        Scanner ob = new Scanner(System.in);

        int v = 5;

        int graph[][] = new int[v+1][v+1];

        addEdges(graph, 0, v,v);

        boolean [] visited = new boolean[v+1];

        for(int i=0;i<v+1;i++){
            visited[i]=false;
        }

        dfs(graph,1,v,visited);

    }
}