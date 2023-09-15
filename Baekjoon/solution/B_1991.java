package solution;

import java.io.*;
import java.util.*;

//트리 순회
/* 이진 트리를 입력받아 전위 순회(preorder traversal), 
 * 중위 순회(inorder traversal), 
 * 후위 순회(postorder traversal)한 결과를 출력
 */
public class B_1991 {

	static class Node {
		char input;
		Node left;
		Node right;

		Node(char input, Node left, Node right) {
			this.input = input;
			this.left = left;
			this.right = right;
		}
	}

	static Node root = new Node('A', null, null);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	//트리 생성
	static void insertNode(Node root, char mid, char left, char right) {

	}

	//전위 순회(preorder traversal)
	//중위 순회(inorder traversal)
	//후위 순회(postorder traversal)

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine()); //노드의 개수

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			char mid = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);

			insertNode(root, mid, left, right);
		}

	}
}
