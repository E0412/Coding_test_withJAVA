package solution;

import java.io.*;
import java.util.*;

//귀걸이 
/*
 * 시나리오 번호와 귀걸이를 돌려받지 못한 여학생의 이름을 공백으로 구분하여 한 줄씩 출력
 */
public class B_1380 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int s_cnt = 0; //시나리오 번호

		while(true) {
			int N = Integer.parseInt(br.readLine());  

			if(N == 0) {
				return; 
			} else {
				s_cnt++;
			}

			ArrayList<String> name = new ArrayList<>(); //여학생 저장 리스트

			//여학생 이름 입력
			for (int i = 0; i < N; i++) {
				name.add(br.readLine());
			}

			ArrayList<Integer> cnt = new ArrayList<>(); //숫자 저장 리스트

			//여학생 번호와 'A'또는 'B' 입력 
			for (int i = 0; i < 2*N - 1; i++) {
				StringTokenizer st  = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());

				//번호가 겹치는 경우 삭제 
				if(cnt.contains(num)) {
					cnt.remove((Integer)num);
				} else {
					cnt.add(num);
				}
			}

			int result = cnt.get(0);
			bw.write(s_cnt + " " + name.get(result - 1) + "\n");
			bw.flush();
		}
	}
}
