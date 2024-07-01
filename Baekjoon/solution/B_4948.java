package solution;

import java.io.*;

//베르트랑 공준
public class B_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;

			int cnt = 0;

			boolean[] arr = new boolean[(2 * N) + 1];
			arr[0] = arr[1] = true; //0과 1 소수 제외 

			for (int i = 2; (i * i) <= (2 * N); i++) {
				if(!arr[i]) 
					for (int j = (i * i); j <= 2 * N; j += i) {
						arr[j] = true;
					}
			}

			//n보다 크고, 2n보다 작거나 같은 경우 cnt++
			for (int i = N + 1; i <= 2 * N; i++) {
				if(!arr[i]) cnt++;
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
	}
}
