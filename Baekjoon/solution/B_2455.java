package solution;

import java.io.*;
import java.util.StringTokenizer;

//지능형 기차
/*
 * 4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 
 * 기차에 사람이 가장 많을 때의 사람 수를 계산한다
 */
public class B_2455 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int now = 0; //현재 탄 사람의 수 
		int total = 0; //가장 많이 타고있을 때 

		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int out = Integer.parseInt(st.nextToken()); //내리는 사람 수
			int in = Integer.parseInt(st.nextToken()); //타는 사람 수

			now = now + in - out; 

			total = Math.max(total, now);
		}
		
		bw.write(total + "");
		bw.flush();
		bw.close();
	}
}
