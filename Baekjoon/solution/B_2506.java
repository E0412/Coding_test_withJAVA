package solution;

import java.io.*;
import java.util.StringTokenizer;

//점수계산
public class B_2506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if(arr[i] == 1) {
				cnt++;
			} 
			//연속으로 문제의 답이 맞는 경우
			//배열 초과가 발생. 다른 방법 찾기
			if(arr[i + 1] == 1) {
				cnt = cnt + 1;
			}
			if(arr[i + 2] == 1) {
				cnt = cnt + 2;
			}
			bw.write(cnt + "");
			bw.flush();
		}
		bw.close();
	}
}
