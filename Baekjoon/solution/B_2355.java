package solution;

import java.io.*;
import java.util.StringTokenizer;

//시그마
public class B_2355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long answer = 0;
		
		//가우스식 덧셈 (A와 B의 합) * (A부터 B까지 숫자의 개수) / 2
		long range = (A + B) * (B - A + 1) / 2; 
		
		//A와 B를 포함한 두 정수 사이에 있는 수의 합 구하기

		bw.flush();
		bw.close();
	}
}
