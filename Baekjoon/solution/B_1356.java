package solution;

import java.io.*;

//유진수
/* 
 * 어떤 수를 10진수로 표현한 뒤 그 수를 두 부분으로 나눴을 때, 
 * 앞부분 자리수의 곱과 뒷부분 자리수의 곱이 같을 때 유진수라고 한다.
 */
public class B_1356 {	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		if(true) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}

		bw.flush();
		bw.close();
	}
}
