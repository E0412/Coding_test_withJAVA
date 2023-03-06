package solution;

import java.io.*;
import java.util.StringTokenizer;

//저작권
/* 
 * 저작권이 있는 멜로디의 평균값 구하기
 */
public class B_2914 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //곡의 개수
		int I = Integer.parseInt(st.nextToken()); //평균값
		
		int answer = A * (I - 1) + 1;
		
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
