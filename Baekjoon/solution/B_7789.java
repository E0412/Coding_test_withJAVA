package solution;

import java.io.*;
import java.util.StringTokenizer;

//텔레프라임
public class B_7789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //원래 전화번호
		int M = Integer.parseInt(st.nextToken() + N); //새로운 전화번호

		int d = 2;
		
		//소수 구분 
		while(true) {
			if(d < N && N % d == 0) {
				bw.write("No");
				break;
			}
			if(d < M && M % d == 0) {
				bw.write("No");
				break;
			}
			d++; //반복 될 때 마다 1을 더한 값을 나눈다
			
			if(d == M) {
				bw.write("Yes");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
