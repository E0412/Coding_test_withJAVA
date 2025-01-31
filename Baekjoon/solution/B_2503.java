package solution;

import java.io.*;
import java.util.StringTokenizer;

//숫자 야구 
public class B_2503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int num = 0; //질문 
		int b = 0; //볼
		int s = 0; //스트라이크

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());


			int b_cnt = 0;
			int s_cnt = 0;

			//영수가 생각하고 있을 가능성이 있는 답의 총 개수 구하기
		}

		bw.flush();
		bw.close();
	}
}
