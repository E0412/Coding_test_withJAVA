package solution;

import java.io.*;
import java.util.StringTokenizer;

//시그마
public class B_2355 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());

		long A = Math.min(a, b);
		long B = Math.max(a, b);

		//가우스식 덧셈 (A와 B의 합) * (A부터 B까지 숫자의 개수) / 2
		long result = (A + B) * ((B - A + 1) / 2); 

		if((B - A + 1) % 2 != 0) {
			result += (A + B) / 2;
		}

		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
