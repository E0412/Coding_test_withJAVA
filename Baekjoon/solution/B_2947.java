package solution;

import java.io.*;
import java.util.StringTokenizer;

//나무 조각
/*
 * 첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
 * 두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
 * 세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
 * 네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
 * 만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.
 */
public class B_2947 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//정렬
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {

			}
		}

		bw.flush();
		bw.close();
	}
}
