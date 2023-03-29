package solution;

import java.io.*;

//막대기
/*
 * 보이는 막대기의 개수를 출력
 */
public class B_17608 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //막대기 개수 
		int[] arr = new int[N];
		
		int cnt = 0; //맨 나중에 입력한 값보다 크면 증가
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			
		}
		
		bw.flush();
		bw.close();
	}
}
