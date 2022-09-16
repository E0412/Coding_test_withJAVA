package solution;

import java.io.*;
import java.util.*;
//풍선 터뜨리기(Deque)
/*
 * 터진 풍선이 양수일 때 그 수만큼 오른쪽으로 이동
 * 음수 일 때 왼쪽으로 이동 
 * 숫자와 값을 구하여 풀어야 한다 
 */
public class B_2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Deque<int[]> dq = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[N]; //입력 값 
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int first = arr[0]; //첫번째 인덱스의 값 
		bw.write("1 "); //1번 풍선을 먼저 터뜨린다

		//dq 할당, 2부터 시작하기 때문에 i + 1을 한다 
		for (int i = 1; i < N; i++) {
			dq.offer(new int[] {(i + 1), arr[i]}); //{풍선의 key, value}
		}

		while(!dq.isEmpty()) {
			//양수인 경우
			if(first > 0) {
				//first 값만큼의 맨 뒤로 보낸다
				//first = 2일 때 2개를 꺼낸 후 맨 뒤로 
				for (int i = 1; i < first; i++) {
					dq.offer(dq.poll());
				}

				//내보낸 값을 배열에 할당
				int[] next = dq.poll();
				first = next[1];
				bw.write(next[0] + " ");
			}
			//음수인 경우
			else {
				for(int i = 1; i< -first; i++) {
					dq.addFirst(dq.pollLast());
				}

				int[] next = dq.pollLast();
				first = next[1];
				bw.write(next[0]+" ");
			}
		}
		bw.flush();
		bw.close();
	}		
}
