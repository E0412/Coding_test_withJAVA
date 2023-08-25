package solution;

import java.io.*;

//트로피 진열
/* 트로피의 높이가 주어졌을 때, 
 * 왼쪽에서 봤을 때 보이는 개수와, 오른쪽에서 봤을 때 보이는 개수를 출력한다
 */
public class B_1668 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); 
		int[] arr = new int[N];

		int cnt = 0; //보이는 트로피의 개수
		int h = 0; //높이 

		//왼쪽에서 보이는 트로피 개수 
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(i == 0) {
				h = arr[i];
				cnt++;
			}
			if(h < arr[i]) {
				h = arr[i];
				cnt++;
			}
		}
		bw.write(cnt + "\n");

		//오른쪽에서 보이는 트로피 개수 
		cnt = 1; //초기화
		h = arr[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if(h < arr[i]) {
				h = arr[i];
				cnt++;
			}
		}

		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}
