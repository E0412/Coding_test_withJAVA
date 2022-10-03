package theory;

import java.util.*;

//Graph Search
//DFS 재귀호출을 이용한 구현 
class Graph2 {
	class Node {
		int data;
		LinkedList<Node> node; //인접한 노드간의 관계 
		boolean visited; //방문 
		
		//데이터를 받고, 방문 초기화, 리스트를 준비 
		Node (int data) {
			this.data = data;
			this.visited = false;
			node = new LinkedList<Node>();
		}
	}
	Node[] nodes;
	Graph2(int size) {
		nodes = new Node[size]; //노드 개수 고정 
		//배열 방 생성
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(i);
		}
	}
	//두 노드의 관계를 저장하는 함수
	void addEdge(int a, int b) {
		Node n = nodes[a]; 
		Node m = nodes[b];
		//데이터 == 인덱스 == 받은 숫자
		//상대방이 있는지 확인 후 서로 추가 
		if(!n.node.contains(m)) {
			n.node.add(m);
		}
		if(!m.node.contains(n)) {
			m.node.add(n);
		}
	}
	
	//재귀호출을 이용한 DFS
	//LinkedList가 노드의 주소를 가져오기 때문에 Node를 받아야한다 
	void dfs(Node r) {
		//받은 노드가 null일 때 return 
		if(r == null) return; 
		r.visited = true; //방문처리
		visit(r); //데이터 출력

		for(Node N : r.node) {
			//호출되지 않은 자식노드 호출 
			if(N.visited == false) {
				dfs(N);
			}
		}
	}
	//시작노드를 다양하게 입력받기 위한 메서드 
	void dfs(int index) {
		Node r = nodes[index];
		dfs(r);
	}
	
	void dfs() {
		dfs(0);
	}
	
	//방문시 출력하는 함수 생성
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

public class G_0117 {
	public static void main(String[] args) {
		Graph2 g = new Graph2(9); 
		//간선 할당 
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		
		g.dfs(); //dfs 실행, 결과 - 0 1 2 4 3 5 6 8 7 
	}
}
