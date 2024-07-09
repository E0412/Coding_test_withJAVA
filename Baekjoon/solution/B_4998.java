package solution;

import java.io.*;
import java.util.StringTokenizer;

//저금
public class B_4998 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());
		
		double N = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double M = Double.parseDouble(st.nextToken());
		
		int cnt = 0;
		
		//출력이 1개만 나오는 문제 해결하기 -> 각 테스트케이스마다 반복필요
		while(M > N) {
			N += N * B / 100;
			cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
