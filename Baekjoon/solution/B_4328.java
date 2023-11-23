package solution;

import java.io.*;
import java.util.StringTokenizer;

//기초 나머지 계산
public class B_4328 {		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int b = 0; int p = 0; int m = 0;

		//반복문으로 입력받으려면 배열에 담는걸 고려
		StringTokenizer st  = new StringTokenizer(br.readLine());
		b = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int mod = p % m;

		if(b == 2) {
			String result = Integer.toBinaryString(mod);
			bw.write(result);
		} 
		if (b == 10) {
			String result = Integer.toHexString(mod);
			bw.write(result);
		}
		if(b == 0) { //종료조건
			return;
		}
		bw.flush();
		bw.close();
	}
}
