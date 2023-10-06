package solution;

import java.io.*;
import java.util.StringTokenizer;

//좋은 자동차 번호판
public class B_1871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			
			StringTokenizer st  = new StringTokenizer(in, "-");	
			String a = st.nextToken(); //첫번째 번호판
			String b = st.nextToken(); //두번째 번호판
			
			int a_num = 0;
			for (int j = 0; j < a.length(); j++) {
				int sum = a.charAt(j) - 'A';
				sum *= Math.pow(26, 2 - j);
				a_num += sum;
			}
			int b_num = Integer.parseInt(b);
			
			//좋은 번호판이면 "nice"를, 아니면 "not nice"를 출력
			if(Math.abs(a_num - b_num) <= 100) {
				bw.write("nice\n");
			} else {
				bw.write("not nice\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
