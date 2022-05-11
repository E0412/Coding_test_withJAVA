package theory;

import java.util.LinkedList;
import java.util.Queue;

//Tree 말단 노드까지의 경로(BFS)
class Node4 {
	Node lt, rt;
	int data;
	public Node4(int val) {
		data = val;
		lt = rt = null;
	}
}
public class S_0110 {
	Node root;
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0; //레벨
		while(!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		S_0110 T = new S_0110();
		T.root = new Node(1);
		T.root.lt = new Node(2);
		T.root.rt = new Node(3);
		T.root.lt.lt = new Node(4);
		T.root.lt.rt = new Node(5);
		System.out.println(T.BFS(T.root));
	}
}
