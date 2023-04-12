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

		//운동 가능 X + T <= M 
		
		bw.flush();
		bw.close();
	}
}
