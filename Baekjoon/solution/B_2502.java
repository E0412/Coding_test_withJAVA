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

		int[] a = new int[D];
		int[] b = new int[D];
		
		a[0] = 1; a[1] = 0;
		b[0] = 0; b[1] = 1;
		
		for (int i = 2; i < D; i++) {
			a[i] = a[i-2] + a[i-1];
			b[i] = b[i-2] + b[i-1];
		}
		for (int i = 1; i < K; i++) {
			int cnt = K - i * a[D-1];
			if(cnt % b[D-1] == 0) {
				bw.write(i + "\n");
				bw.write(cnt / b[D-1] + "");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
