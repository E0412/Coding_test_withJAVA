package solution;
import java.io.*;
import java.util.*;

//요세푸스 문제 0(Queue)
/**
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고 순서대로 K번째 사람을 제거한다
 * N명의 사람들이 모두 제거될 때 까지 반복한다 
 *
 */
public class B_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //전체 인원 수 
		int K = Integer.parseInt(st.nextToken()); //K번째 
		int result = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		//1번부터 시작 
		for (int i = 1; i <= N; i++) {
			queue.offer(i); //순서대로 추가한다
		}
		while(!queue.isEmpty()) { //queue가 비어있지 않을 때 
			for (int i = 1; i < K; i++) {
				queue.offer(queue.poll()); 
			}
		}
		System.out.println("<" + queue.poll() + ">");
	}
}

