package solution;

import java.io.*;
import java.util.StringTokenizer;

//핸드폰 요금
/*
 * 영식 요금제 : 30초마다 10원씩 청구, 29초 이하는 10원, 30초부터 59초는 20원
 * 민식 요금제 : 60초마다 15원씩 청구, 59초 이하는 15원, 60초부터 119초는 30원
 * 더 나은 요금제를 출력한다
 */
public class B_1267 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int time = 0; //통화 시간

		int Y = 0; //영식 요금제
		int M = 0; //민식 요금제

		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { 
			time = Integer.parseInt(st.nextToken());

			Y += ((time / 30) + 1) * 10;
			M += ((time / 60) + 1) * 15;
		}

		//요금제가 같을 때
		if (M == Y) {
			bw.write("Y M " + Y);
		} 
		//영식 요금제의 합이 더 클 때 = 민식 요금제가 더 나은 요금제
		else if (M < Y) {
			bw.write("M " + M);
		} 
		//민식 요금제의 합이 더 큰 경우
		else if (M > Y) {
			bw.write("Y " + Y);
		}

		bw.flush();
		bw.close();
	}
}
