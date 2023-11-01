package solution;

import java.io.*;
import java.util.StringTokenizer;

//수들의 합 2
public class B_2003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		//경우의 수 구하기
		int start = 0, end = 0, result = 0, sum = 0;

		while(true) {
			//원소의 합이 M이 되는 경우 
			if (sum == M) result++; //경우의 수를 더해준다

			//원소의 합이 M보다 큰 경우 원소들을 빼준다
			if(sum >= M) {
				sum -= arr[start++];
			} 
			//배열의 끝에 도착한 경우 종료
			else if(end == N) {
				break;
			} 
			//그 외에는 합한다 
			else{
				sum += arr[end++];
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
