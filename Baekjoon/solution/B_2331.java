package solution;

import java.io.*;
import java.util.*;

//반복수열
public class B_2331 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<Integer>();
		list.add(N);

		while(true) {
			int num = list.get(list.size() - 1);

			int next = 0;
			while(num != 0) {
				next += (int) Math.pow(num % 10, (double) M);
				next /= 10;
			}

			if(list.contains(next)) {
				int answer = list.indexOf(next);
				bw.write(answer + "\n");
				break;
			}
			list.add(next);
		}
		bw.flush();
		bw.close();
	}
}
