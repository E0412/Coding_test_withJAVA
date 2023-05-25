package solution;

import java.io.*;
import java.util.StringTokenizer;

//뒤집힌 덧셈
public class B_1357 {

	//숫자 뒤집기 
	private static int reverse(int input) {
		int rev = 0;

		while(input != 0) {
			int mod = input % 10; //1. 숫자를 10으로 나눈 나머지를 구한다
			rev = rev * 10 + mod; //2. 나머지를 더할 때 기존 숫자에 * 10을 한다
			input /= 10; //3. 입력받은 값을 10으로 나눈다.
		}
		return rev;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int revX = reverse(X);
		int revY = reverse(Y);
		int answer = revX + revY;

		bw.write(answer + ""); //테스트 미통과
		bw.flush();
		bw.close();
	}
}
