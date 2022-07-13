package solution;

import java.io.*;

//수 정렬하기3(counting sort)
public class B_10989 {
	public static void main(String[] args) throws IOException {
		int[] cnt = new int[10001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) { //인덱스 값을 1 증가
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		//1부터 시작
		for(int i = 1; i < 10001; i++) {
			//i 값의 개수가 0이 될 때까지 출력(빈도수)
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}
}
