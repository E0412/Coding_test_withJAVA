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
		int[] time = new int[N]; //통화 시간

		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) { 
			time[i] = Integer.parseInt(st.nextToken());
		}

		//영식은 Y 민식은 M으로 출력

		bw.flush();
		bw.close();
	}
}
