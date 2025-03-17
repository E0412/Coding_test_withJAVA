package solution;

import java.io.*;
import java.util.StringTokenizer;

//카드놀이
public class B_2511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] card_A = new int[10];
		int[] card_B = new int[10];
		int a = 0;
		int b = 0;

		for (int i = 0; i < 10; i++) {
			card_A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++) {
			card_B[i] = Integer.parseInt(st.nextToken());
		}

		//게임 승점
		for (int i = 0; i < 10; i++) {
			//A가 이긴경우
			if(card_A[i] > card_B[i]) {
				a += 3;
			}
			//B가 이긴경우
			if(card_A[i] < card_B[i]) {
				b += 3;
			}
			//비긴경우
			if(card_A[i] == card_B[i]) {
				a++;
				b++;
			}
		}

		//승점 출력 & 이긴사람 출력
		
		bw.flush();
		bw.close();
	}
}
