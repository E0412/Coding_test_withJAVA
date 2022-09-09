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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //전체 인원 수 
		int K = Integer.parseInt(st.nextToken()); //K번째 
		int result = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		//1번부터 시작, queue 할당  
		for (int i = 1; i <= N; i++) {
			queue.offer(i); //순서대로 추가한다
		}

		//출력 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("<");
		//queue에 할당된 수가 1개보다 많을 때 반복 
		while(queue.size() > 1) { 
			for (int i = 0; i < K - 1; i++) {
				//K개 이전까지의 수를 꺼내고 다시 추가한다 
				queue.offer(queue.poll()); 
			}
			bw.write(queue.poll() + ", "); //마지막 원소 이전까지 내보낸다 
		}
		bw.write(queue.poll() + ">"); //마지막 원소는 >와 함께 출력한다 
		bw.flush();
		bw.close();
	}
}

