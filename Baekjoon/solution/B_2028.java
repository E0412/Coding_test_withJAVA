package solution;

import java.io.*;

//자기복제수
/*
 * 어떤 자연수 N을 제곱했을 때, 
 * 그 제곱수의 맨 뒷자리에 원래의 수 N이 다시 나타나면, 그 N을 자기복제수라고 한다.
 */
public class B_2028 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int pow = N * N;

			boolean chk = true;
			//자기복제수인지 확인
			while(N > 0) {
				if(N % 10 != pow % 10) chk = false;
				N /= 10; 
				pow /= 10;
			}
			if(chk) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
