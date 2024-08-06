package solution;

import java.io.*;
import java.util.*;

//반복수열
public class B_2331 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		int M = Integer.parseInt(st.nextToken());

		List<String> list = new ArrayList<>();
		list.add(N);

		int num = 0;
		//반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 출력
		for (int i = 0; i < N.length(); i++) {
			num += Math.pow(N.charAt(i) - '0', M);
		}
		
		String next = String.valueOf(num);
		int answer = 0;
		if(list.contains(next)) {
			answer = list.indexOf(next);
			return;
		} else {
			list.add(String.valueOf(next));
			
		}
		
		
		
		bw.flush();
		bw.close();
	}
}
