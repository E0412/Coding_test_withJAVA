package solution;

import java.io.*;
import java.util.StringTokenizer;

//나는 요리사다
/*
 * 각 참가자가 얻은 평가 점수가 주어졌을 때, 
 * 우승자와 그의 점수를 구하는 프로그램을 작성한다
 */
public class B_2953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	

		int[][] arr = new int[5][4];

		int total = 0; //평가점수 총합
		int max = 0; //최대 점수
		int num = 0; //참가자 번호

		for (int i = 0; i < 5; i++) {
			st  = new StringTokenizer(br.readLine());	
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				total += arr[i][j]; //점수의 합 저장
			}
			//최대 점수
			if(total > max) {
				num = i++;
				max = total;
			}
			total = 0;
		}
		bw.write(num + " " + max);
		bw.flush();
		bw.close();
	}
}
