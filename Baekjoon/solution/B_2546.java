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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		//테스트 케이스만큼 반복
		while(T-- > 0) {

			br.readLine(); //공백

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //c언어 수강생 IQ
			int M = Integer.parseInt(st.nextToken()); //경제학 원론 IQ

			int n[] = new int[N + 1];
			int m[] = new int[M + 1];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				n[i] = Integer.parseInt(st.nextToken()); 
				System.out.print(n[i] + " "); //제대로 입력됐는지 확인
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				m[i] = Integer.parseInt(st.nextToken()); 
				System.out.print(m[i] + " ");
			}
			//각 과목의 평균을 구하고 c언어 평균보다 낮고 경제학에서는 높은 경우 +1
			int cnt = 0;

		}

		bw.flush();
		bw.close();
	}
}

