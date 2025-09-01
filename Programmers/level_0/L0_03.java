package level_0;

import java.io.*;
import java.util.StringTokenizer;

//문자열 반복해서 출력하기
public class L0_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String in = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			System.out.print(in);
		}
	}
}
