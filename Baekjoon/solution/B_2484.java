package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위 네개 
public class B_2484 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int money = 0; //최대 상금
		int max = 0; //최대 상금 중 제일 큰 수 저장 

		for (int i = 0; i < N; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());

			int cnt = 0; //중복 횟수
			int d1 = 0; //최대로 중복되는 주사위
			int d2 = 0;

			int[] arr = new int[4];
			for (int a = 0; a < N; a++) {
				arr[a] = Integer.parseInt(st.nextToken());
			}

			//1~6 반복
			for (int d_num = 1; d_num <= 6; d_num++) {
				int tmp = 0;

				//4개의 주사위 호출 
				for (int c = 0; c < arr.length; c++) {
					//중복되는 경우 + 1
					if(d_num == arr[c]) {
						tmp = tmp + 1;  
					}
				}
				//큰 주사위 갯수가 많은 경우
				if(cnt < tmp && d1 < d_num) {
					cnt = tmp;
					d1 = d_num;
					d2 = 0;
				} 
				//중복x
				else if(cnt == tmp && d1 < d_num && cnt == 1) {
					d1 = d_num;
				} 
				//2개씩 두 쌍이 나오는 경우
				else if(cnt == tmp) {
					d2 = d_num;
				}
			}
			//계산 
			if(cnt == 4) {
				money = 50000 + d1 * 5000;
			} 
			else if(cnt == 3) {
				money = 10000 + d1 * 1000;
			} 
			else if(cnt > 1 && d2 > 0) {
				money = 2000 + d1 * 500 + d2 * 500;
			}
			else if(cnt == 2) {
				money = 1000 + d1 * 100;
			} 
			else if(cnt == 1) {
				money = d1 * 100;
			} 
			//가장 큰 상금값 찾기
			if(money > max) max = money;
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}
