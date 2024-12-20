package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위 게임
public class B_2476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int sum = 0;

			//1번 규칙
			if(a == b && b == c) {
				sum = 10000 + (a) * 1000;
			} 
			//2번 규칙
			else if(a == b && b != c || a == c && a != b){
				sum = 1000 + a * 100;
			} else if(b == c && b != a) {
				sum = 1000 + b * 100;
			}
			//3번 규칙
			else if(a != b && b != c && c != a) {
				int max = Math.max(a, Math.max(b, c));
				sum = max * 100;
			} 
			arr[i] = sum;
			//상금을 가장 많이 받은 사람 출력 
			if(arr[i] > result) result = arr[i]; 
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
