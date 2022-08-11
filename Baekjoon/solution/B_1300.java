package solution;

import java.io.*;

//배열에서 k번째 수 찾기
/**
* 배열에 들어있는 수 arr[i][j] = i * j
* 이 수를 1차원 배열 B에 넣으면 크기가 N * N이 된다 
* B를 오름차순 정렬했을때의 B[k]를 구한다 
*/
public class B_1300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		long start = 1, end = K;
		long answer = 0;
		
		//이진 탐색 수행
		while(start <= end) {
			long mid = (start + end) / 2;
			long cnt = 0;
			//중앙값보다 작은 수의 개수 계산
			for (int i = 1; i <= N; i++) { //인덱스 1부터 시작
				cnt += Math.min(mid / i, N); //작은 수 카운트
			}
			if(cnt < K) {
				start = mid + 1;
			} else {
				answer = mid; //중앙값을 정답에 저장
				end = mid - 1;
			}
		}
		System.out.println(answer);
	}
}
