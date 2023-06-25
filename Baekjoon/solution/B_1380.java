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

		int s_cnt = 1; //시나리오 번호

		while(true) {
			String input = ""; //A 또는 B 입력

			String g_cnt = br.readLine(); //압수당한 여학생 수 
			int N = Integer.parseInt(g_cnt);

			if(N == 0) {
				break;
			}

			//이름 저장 배열
			String[] name = new String[N];
			for (int i = 0; i < N; i++) {
				name[i] = br.readLine();
			}

			ArrayList<String> list = new ArrayList<>(); //번호를 입력받을 리스트

			//여학생 번호와 'A'또는 'B' 입력 
			for (int i = 0; i < 2*N - 1; i++) {
				StringTokenizer st  = new StringTokenizer(br.readLine());
				String num = st.nextToken();
				
				//번호가 겹치는 경우 삭제 
				if(list.contains(num)) {
					list.remove(num);
				} else {
					list.add(num);
				}
				input = br.readLine();
			}

			Integer result = Integer.parseInt(list.get(0)) - 1;
			bw.write(s_cnt + " " + name[result]);
		}

		bw.flush();
		bw.close();
	}
}
