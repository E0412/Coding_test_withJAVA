package solution;

import java.io.*;
import java.util.StringTokenizer;

//약수 구하기
public class B_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//약수를 구한 뒤 배열에 저장, K번째로 작은 수 출력
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[10000];
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				arr[i] = i;
			} 
		}
		bw.write(arr[K] + "");
		bw.flush();
		bw.close();
	}
}
