package solution;

import java.io.*;
import java.util.StringTokenizer;

//약수 구하기
public class B_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//약수를 구한 뒤 배열에 저장, K번째로 작은 수 출력
		//(실패 후 수정)-> 찾고자 하는 약수의 수를 세고 해당 약수 출력
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int cnt = 0; //약수의 개수
		int answer = 0;

		for (int i = 1; i <= N; i++) {
			//약수인 경우
			if(N % i == 0) {
				cnt++; 
			} 
			//찾고자 하는 수 저장
			if(cnt == K) {
				answer = i;
				break;
			}
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
