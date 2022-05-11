package theory;

//Tree 말단 노드까지의 경로(DFS)
//원래는 BFS로 푸는 것이 맞다 
class Node3 {
	int data;
	Node3 lt, rt;
	public Node3(int val) {
		data = val;
		lt = rt = null;
	}
}
public class S_0109 {
	Node root;
	public int DFS(int L, Node root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		S_0109 T = new S_0109();
		T.root = new Node(1);
		T.root.lt = new Node(2);
		T.root.rt = new Node(3);
		T.root.lt.lt = new Node(4);
		T.root.lt.rt = new Node(5);
		System.out.println(T.DFS(0, T.root));
	}
}
