package solution;

import java.io.*;
import java.util.*;

//회전하는 큐(Queue)
/*
 * 첫 번째 원소를 뽑아낸다. 
 * 뽑고자 하는 원소가 덱의 중앙에서 끝쪽에 가까운 쪽 방향으로 이동(연산)하여 
 * 뽑고자 하는 원소가 첫 번째 위치에 갈 때까지 반복한다 
 */
public class B_1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		LinkedList<Integer> dq = new LinkedList<Integer>();
		
		int N = Integer.parseInt(st.nextToken()); //큐의 크기
		int M = Integer.parseInt(st.nextToken()); //뽑으려는 숫자개수 
		int count = 0; // 2, 3번 연산 횟수의 누적 합
		
		//1부터 N까지 담는다
		for (int i = 1; i <= N; i++) {
			dq.offer(i);
		}
		
		int[] arr = new int[M]; //뽑고자 하는 수
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			//덱에서 뽑고자 하는 숫자와 위치 찾기
			int target = dq.indexOf(arr[i]);
			int mid; //중간지점
			
			if(dq.size() % 2 == 0) {
				mid = dq.size() / 2 - 1;
			} else {
				mid = dq.size() / 2;
			}
			
			// 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
			if(target <= mid) {
				// mid 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
				for(int j = 0; j < target; j++) {
					int tmp = dq.pollFirst();
					dq.offerLast(tmp);
					count++;
				}
			}
			else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우 
				// idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
				for(int j = 0; j < dq.size() - target; j++) {
					int tmp = dq.pollLast();
					dq.offerFirst(tmp);
					count++;
				}
			}
			dq.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제한다 
		}

		System.out.println(count);
	}
}
