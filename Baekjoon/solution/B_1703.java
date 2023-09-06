package solution;

import java.io.*;
import java.util.StringTokenizer;

//생장점
public class B_1703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int branch = 1; //가지의 수

		while(true) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken()); //나무의 나이

			//0이 주어지면 입력 종료
			if(age == 0) {
				break;
			}

			for (int i = 0; i < age; i++) {
				branch *= Integer.parseInt(st.nextToken()); 
				branch -= Integer.parseInt(st.nextToken()); //가지치기 한 가지의 수
			}
			bw.write(branch + "\n");
			branch = 1; //초기화 
		}
		bw.flush();
		bw.close();
	}
}
