package solution;

import java.io.*;
import java.util.*;

//노래 악보
public class B_1392 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); //악보 수
		int Q = Integer.parseInt(st.nextToken()); //질문의 개수

		List<Integer> list = new ArrayList<>();


		//각 악보가 차지하는 시간(초)
		for (int i = 1; i <= N; i++) { //악보는 1부터 시작
			int time = Integer.parseInt(br.readLine()); 

			//시간만큼 반복하여 곡 번호 저장
			for (int j = 0; j < time; j++) {
				list.add(i); 
			}
		}

		//해당 초에 부르는 악보의 번호 구하기
		for (int i = 0; i < Q; i++) {
			int cnt = Integer.parseInt(br.readLine());
			bw.write(list.get(cnt) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
