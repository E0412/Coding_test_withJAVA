package solution;

import java.io.*;
import java.util.StringTokenizer;

//점수계산
public class B_2506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int cnt = 0;
		int answer = 0;
		boolean chk = false;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			//문제를 맞춘 경우 
			if(arr[i] == 1) {
				//이전 문제를 맞은 경우
				if(chk) {
					cnt++;
				}
				//이전 문제가 틀린경우
				else {
					cnt = 1; //초기화
					chk = true;
				} 
				answer += cnt;
			} else {
				chk = false;
				cnt = 0; //초기화 
			}
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
