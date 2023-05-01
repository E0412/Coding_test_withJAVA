package solution;

import java.io.*;
import java.util.*;

//쉽게 푸는 문제
/*
 * 1 2 2 3 3 3 4 4 4 4 5--- 의 수열에서 특정 구간의 합 구하기
 */
public class B_1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int A = Integer.parseInt(st.nextToken()); //구간 시작
		int B = Integer.parseInt(st.nextToken()); //구간 끝 

		ArrayList<Integer> list = new ArrayList<Integer>();

		int cnt = 1;

		//수열 채우기
		for (int i = 0; i < B; i++) {
			for (int j = 0; j < cnt; j++) {
				list.add(cnt);
			}
			cnt++;
		}

		int sum = 0;
		// A와 B사이의 합을 구한다
		for (int i = A - 1; i < B; i++) {
			sum += list.get(i);
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
