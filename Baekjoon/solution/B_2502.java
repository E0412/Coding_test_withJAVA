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

		int[] arr = new int[D];

		for (int a = 1; a <= K / 2; a++) {
			for (int b = a + 1; b < K; b++) {
				arr[0] = a;
				arr[1] = b;
				for (int c = 2; c < D; c++) {
					arr[c] = arr[c-1] + arr[c-2];
				}
				if(arr[D-1] == K) {
					bw.write(arr[0] + "\n");
					bw.write(arr[1] + "\n");
					bw.flush();
					bw.close();
				}
			}
		}
	}
}
