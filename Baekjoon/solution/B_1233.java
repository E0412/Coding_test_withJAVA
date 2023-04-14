package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위
/*
 * 가장 높은 빈도로 나오는 세 주사위 합을 구한다
 * 답이 여러개인 경우 가장 합이 작은 것을 출력
 */
public class B_1233 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		int S3 = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		bw.flush();
		bw.close();
	}
}
