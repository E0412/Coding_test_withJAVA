package solution;

import java.io.*;
import java.util.StringTokenizer;

//도비의 영어 공부
public class B_2386 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int cnt = 0;

		while(true) {
			String s = br.readLine();

			if(s.equals("#")) break; //입력의 마지막은 #이다

			st = new StringTokenizer(br.readLine(), " ");
			char c = st.nextToken().charAt(0);

			//소문자로 변환 후 같은 단어 개수를 찾기 

		}
		bw.flush();
		bw.close();
	}
}
