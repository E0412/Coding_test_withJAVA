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
		//루트 노드인지 확인
		if(root.input == mid) {
			//자식노드가 '.'이면 null
			if(left == '.') {
				root.left = null;
			} 
			//그 외엔 새로운 노드 생성
			else {
				root.left = new Node(left, null, null);
			}
			if(right == '.') {
				root.right = null;
			} else {
				root.right = new Node(right, null, null);
			}
		} else {
			if(root.left != null) insertNode(root.left, mid, left, right);
			if(root.right != null) insertNode(root.right, mid, left, right);
		}
	}

	//전위 순회(preorder traversal)
	static void preorder(Node in) throws IOException {
		if(in == null) return;
		bw.write(in.input);
		preorder(in.left);
		preorder(in.right);
	}

	//중위 순회(inorder traversal)
	static void inorder(Node in) throws IOException {
		if(in == null) return;
		inorder(in.left);
		bw.write(in.input);
		inorder(in.right);
	}

	//후위 순회(postorder traversal)
	static void postorder(Node in) throws IOException {
		if(in == null) return;
		postorder(in.left);
		postorder(in.right);
		bw.write(in.input);
	}

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

		preorder(root);
		bw.write("\n");

		inorder(root);
		bw.write("\n");

		postorder(root);
		bw.write("\n");

		bw.flush();
		bw.close();
	}
}
