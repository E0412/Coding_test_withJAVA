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

		String input = br.readLine();
		String result = "NO"; //결과값 디폴트 NO

		//각 부분에 적어도 한자리가 있어야 함
		if(input.length() > 1) {
			for (int i = 1; i < input.length(); i++) {
				int n = 1; //앞부분 자리수 곱
				int m = 1; //뒷부분 자리수 곱

				for (int j = 0; j < i; j++) {
					n *= (input.charAt(j) - '0');
				}

				for (int k = i; k < input.length(); k++) {
					m *= (input.charAt(k) - '0');
				}

				//두 자리수의 곱이 같을 때 유진수가 된다
				if(n == m) {
					result = "YES";
					break;
				}
			}
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
