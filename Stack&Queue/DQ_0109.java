import java.io.*;
import java.util.*;

//최소값 찾기(Deque)
//정렬 알고리즘을 이용하지 않는 방법이다 
public class DQ_0109 {
	static class Node { //인덱스와 값 
		public int value;
		public int index;
	
	Node(int value, int index) {
		this.value = value;
		this.index = index;
	}
}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//출력을 버퍼에 넣고 한번에 출력하기위해 사용
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //숫자의 개수
		int M = Integer.parseInt(st.nextToken()); //슬라이딩 윈도우 크기
		st = new StringTokenizer(br.readLine());
		
		Deque<Node> deque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
		//새로운 값이 들어올때마다 정렬 대신 현재 수보다 큰 값을 제거 
		while(!deque.isEmpty() && deque.getLast().value > now) {
			deque.removeLast();
		}
		deque.addLast(new Node(now, i));
		
		//범위에서 벗어난 값은 덱에서 제거
		if(deque.getFirst().index <= i - M) {
			deque.removeFirst();
		}
		bw.write(deque.getFirst().value+ " ");
		}
		bw.flush();
		bw.close();
	}
}
