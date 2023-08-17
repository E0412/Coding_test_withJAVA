package solution;

import java.io.*;
import java.util.StringTokenizer;

//영식이와 친구들
public class B_1592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int answer = 0; //전체 횟수 
		int[] cnt = new int[N + 1]; //공을 받은 횟수
		int po = 1; //1번자리

		while(true) {
			cnt[po]++; //공을 다른사람에게 던진다

			//공을 M번 받으면 종료
			if(cnt[po] == M) break;

			//홀수인 경우
			if(cnt[po] % 2 == 1) {
				po += L; //시계 방향으로 L번째 사람에게 공을 던진다 
				//시계방향이면서 값을 벗어나는 경우
				if(po > N) {
					po -= N;
				}
			} 
			//짝수인 경우
			else if(cnt[po] % 2 == 0){
				po -= L; //반시계 방향으로 L번째 사람에게 공을 던진다 
				//반시계방향이면서 값을 벗어나는 경우
				if(po < 1) {
					po += N;
				}
			}
			answer++;
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
