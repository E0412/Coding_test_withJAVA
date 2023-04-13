package solution;

import java.io.*;
import java.util.StringTokenizer;

//운동
/*
 * 운동을 N분하는데 필요한 시간의 최솟값을 출력
 * 운동을 N분 할 수 없다면 -1을 출력
 */
public class B_1173 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken()); //초기 맥박 
		int M = Integer.parseInt(st.nextToken()); //맥박 최대치
		int T = Integer.parseInt(st.nextToken()); //맥박 증가치 
		int R = Integer.parseInt(st.nextToken()); //맥박 감소치(휴식)

		int time = 0; //최소 시간
		int start = m; //초기 맥박
		int ex = 0; //운동


		while(ex != N) {
			time++; //시간 증가

			//운동 후 맥박이 최대 맥박보다 작을 시 운동시작
			if(m + T <= M) {
				m += T; //초기 맥박에 증가치를 더한다
				ex++;
			} 
			//휴식
			else {
				m -= R; //초기 맥박에 감소치를 뺀다

				//초기 맥박 이하인 경우 초기값으로 세팅
				if(m < start)
					m = start;
			}
			//운동 후 맥박이 최대보다 크고, 초기 맥박인 경우 중지
			if((m + T > M) && (m == start)) 
				break;
		}

		//운동을 N분 할 수 없다면 -1을 출력
		if(ex != N) {
			bw.write("-1");
		} else {
			bw.write(time + "");
		}

		bw.flush();
		bw.close();
	}
}
