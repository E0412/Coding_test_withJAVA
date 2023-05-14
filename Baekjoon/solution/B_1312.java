package solution;

import java.io.*;
import java.util.StringTokenizer;

//소수
public class B_1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int A = Integer.parseInt(st.nextToken()); //분자
		int B = Integer.parseInt(st.nextToken()); //분모
		int N = Integer.parseInt(st.nextToken()); //소수점 아래 N자리 수

		//A / B를 했을 때 소수점 N번째 수 출력 

		bw.flush();
		bw.close();
	}
}
