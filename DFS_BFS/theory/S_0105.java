package theory;


//이진 트리 순회(전위, 중위, 후위 순회)
class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class S_0105 {
	Node root;
	public void DFS(Node root) {
		if(root == null) return;
		else {
			System.out.print(root.data + " "); //출력 위치에 따라 전위, 중위, 후위 순회로 나눠진다
			DFS(root.lt);
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args) {
		S_0105 tree = new S_0105();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.lt = new Node(7);
		tree.DFS(tree.root);
	}
}
