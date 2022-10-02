package theory;

import java.util.*;

//Graph Search
//DFS 구현 - 강의 참고
class Graph {
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
	Graph(int size) {
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
	//DFS 호출
	void DFS() {
		DFS(0); //0번부터 시작 
	}
	//시작인덱스를 받는 DFS 메서드
	void DFS(int index) {
		Node root = nodes[index]; //해당 인덱스로 노드를 가져온다
		Stack<Node> stack = new Stack<>();

		stack.push(root); //현대 노드를 스택에 추가한다 
		root.visited = true; //방문처리

		//스택에 데이터가 없을때까지 반복
		while(!stack.isEmpty()) {
			Node r = stack.pop(); //스택에서 데이터를 가져온다
			for(Node N : r.node) {
				//스택에 추가되지 않은 노드 추가
				if(N.visited == false) { 
					N.visited = true;
					stack.push(N); 
				}
			}
			visit(r);
		}
	}
	//방문시 출력하는 함수 생성
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

public class G_0116 {
	public static void main(String[] args) {
		Graph graph = new Graph(9); 
		//간선 할당 
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(5, 6);
		graph.addEdge(5, 7);
		graph.addEdge(6, 8);

		graph.DFS(); //DFS 실행 
	}
}
