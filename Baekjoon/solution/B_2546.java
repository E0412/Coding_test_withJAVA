package solution;

import java.io.*;
import java.util.StringTokenizer;

/* 
 * 각 학생의 IQ가 주어질때, C언어 수강생 중에 C언어를 드랍하고 경제학 원론을 수강해서 
 * 두 과목의 평균 IQ를 모두 올려줄 수 있는 사람의 수를 구하시오.
 */
//경제학과 정원영
public class B_2546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		//테스트 케이스만큼 반복
		while(T-- > 0) {
			br.readLine(); //공백

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //c언어 수강생 IQ
			int M = Integer.parseInt(st.nextToken()); //경제학 원론 IQ

			int n[] = new int[N];

			//int형 사용시 틀림 -> double로 변경
			double avgC = 0; //c언어 평균
			double avgE = 0; //경제학 평균

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				n[i] = Integer.parseInt(st.nextToken());
				avgC += n[i];
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				avgE += Integer.parseInt(st.nextToken());
			}

			int cnt = 0;

			for (int i = 0; i < N; i++) { 
				//C언어 평균보다는 낮고, 경제학 평균보다는 높은 경우 cnt++
				if(avgC / N > n[i] && avgE / M < n[i]) 
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}

