package solution;

import java.io.*;

//포도주 시식
public class B_2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int[] amt = new int[N + 1];
		amt[1] = arr[1];
		
		if(N > 1) {
			amt[2] = arr[1] + arr[2];
		}
		for (int i = 3; i <= N; i++) {
			amt[i] = Math.max(amt[i - 1], Math.max(amt[i - 2] + arr[i], amt[i - 3] + arr[i - 1] + arr[i])); 
		}
		bw.write(amt[N] + "");
		bw.flush();
		bw.close();
	}
}
