package theory;

import java.util.*;

//BFS 구현 
public class B_1115 {
	
	//방문 여부 확인 
	public static boolean check[] = new boolean[9];
	//그래프 생성 
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//BFS 구현
	public static void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x); 
		//현재 노드를 방문처리한다 
		check[x] = true;
		
		//Queue가 빌 때까지 반복
		while(!q.isEmpty()) {
			int n = q.poll(); //하나의 원소를 뽑아 출력
			System.out.print(n + " ");
			
			//해당 원소와 연결 된 방문하지 않은 원소를 큐에 넣는다
			for (int i = 0; i < graph.get(x).size(); i++) {
				int m = graph.get(x).get(i);
				if(!check[m]) {
					q.offer(m);
					check[m] = true; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		 // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드정보 저장 
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        
        // 노드 2에 연결된 노드정보 저장 
        graph.get(2).add(1);
        graph.get(2).add(7);
        
        // 노드 3에 연결된 노드정보 저장 
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        
        // 노드 4에 연결된 노드정보 저장 
        graph.get(4).add(3);
        graph.get(4).add(5);
        
        // 노드 5에 연결된 노드정보 저장 
        graph.get(5).add(3);
        graph.get(5).add(4);
        
        // 노드 6에 연결된 노드정보 저장 
        graph.get(6).add(7);
        
        // 노드 7에 연결된 노드정보 저장 
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        
        // 노드 8에 연결된 노드정보 저장 
        graph.get(8).add(1);
        graph.get(8).add(7);

        BFS(1);
	}
}
