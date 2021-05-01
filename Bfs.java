package com.company;

import java.util.*;

public class Bfs{

    public static void bfs(int [][] graph, int start, int v){

        Queue<Integer> q = new LinkedList<>();

        boolean visited [] = new boolean[v+1];

        for(int i=0;i<v+1;i++){
            visited[i]=false;
        }

        q.offer(start);
        visited[start]=true;

        while(q.isEmpty()==false){

            Integer curr = q.poll();

            System.out.println(curr);



            for(int i=0;i<=v;i++){
                if(visited[i]==false && graph[curr][i]==1){
                    q.offer(i);
                    visited[i]=true;
                }
            }


        }



    }




}
