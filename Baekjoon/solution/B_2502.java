package solution;

import java.io.*;
import java.util.StringTokenizer;

//떡 먹는 호랑이 
public class B_2502 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int D = Integer.parseInt(st.nextToken()); //할머니가 넘어온 날
		int K = Integer.parseInt(st.nextToken()); //호랑이에게 준 떡의 개수

		int A = 0; //첫 날에 준 떡의 개수 
		int B = 0; //둘째 날에 준 떡의 개수

		//첫줄에 첫 날에 준 떡의 개수 A를 출력하고 그 다음 둘째 줄에는 둘째 날에 준 떡의 개수 B를 출력



		bw.flush();
		bw.close();
	}
}
