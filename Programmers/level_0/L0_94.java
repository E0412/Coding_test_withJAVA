package level_0;

import java.io.*;

//세균 증식
public class L0_94 {
	public static int solution(int n, int t) {
		int answer = n;
		while(t-- > 0) {
			answer *= 2;
		}
		return answer;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());

		System.out.println(solution(n, t));
	}
}
