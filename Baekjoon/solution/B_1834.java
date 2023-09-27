package solution;

import java.io.*;

//나머지와 몫이 같은 수
public class B_1834 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.parseLong(br.readLine());
		long sum = 0;
		
		for (long i = 1; i < N; i++) {
			sum += (N + 1) * i; //나머지와 몫이 같은 자연수 : N - 1개, 이들은 배수관계
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
