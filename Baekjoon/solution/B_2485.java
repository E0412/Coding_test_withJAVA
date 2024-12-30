package solution;

import java.io.*;
import java.util.Arrays;

//가로수
public class B_2485 {

	//최대 공약수
	static int GCD(int n, int m) {
		if(m == 0) return n;
		else return GCD(m, n % m);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int gcd = 0; //최대 공약수

		for (int i = 0; i < N - 1; i++) {
			int dis = arr[i + 1] - arr[i]; //간격
			gcd = GCD(dis, gcd);
		}

		//모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수 구하기
		int answer = (arr[N - 1] - arr[0]) / gcd - N + 1;
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
