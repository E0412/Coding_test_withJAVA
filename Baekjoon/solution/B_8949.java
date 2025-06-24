package solution;

import java.io.*;
import java.util.StringTokenizer;

//대충 더해
public class B_8949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String n = st.nextToken();
		String m = st.nextToken();

		int a = n.length(); int b = m.length();

		//더 큰 숫자를 a에 저장
		if(a < b) {
			String tmp = n;
			n = m;
			m = tmp;

			int tmp2 = a;
			a = b;
			b = tmp2;
		}

		int len = a - b;

		for (int i = 0; i < len; i++) {
			int result = n.charAt(i) - '0'; //Character.getNumericValue()도 사용가능
			bw.write(result + "");
		}

		for (int i = 0; i < b; i++) {
			int result = n.charAt(len + i) - '0' + m.charAt(i) - '0';
			bw.write(result + "");
		}
		bw.flush();
		bw.close();
	}
}
