package solution;

import java.io.*;
import java.util.StringTokenizer;

//언더프라임
/* 언더프라임 : 어떤 수 X를 소인수분해 해서 구한 소수의 목록의 길이가 소수인 수
 * ex) 12
 */
public class B_1124 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int cnt = 0; // A보다 크거나 같고, B보다 작거나 같은 언더프라임 개수

		boolean[] pList = new boolean[B + 1]; 
		int[] pCnt = new int[B + 1]; 

		for (int i = 2; i <= B; i++) {
			if(pList[i]) continue;

			for (int j = i + i; j <= B; j++) {
				pList[j] = true; //소수 체크
				int len = j;
				//소수의 목록 길이가 소수인 경우

			}
		}

		bw.flush();
		bw.close();
	}
}
