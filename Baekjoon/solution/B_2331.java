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

		//반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 출력

		bw.flush();
		bw.close();
	}
}
