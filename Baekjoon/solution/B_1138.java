package solution;

import java.io.*;
import java.util.StringTokenizer;

//한 줄로 서기
public class B_1138 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int ans[] = new int[N + 1]; 

		StringTokenizer st  = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			int tall = Integer.parseInt(st.nextToken()); //i보다 큰 사람 수
			for (int j = 1; j <= N; j++) {
				//키가 큰 사람이 없는경우
				if(tall == 0 && ans[j] == 0) {
					ans[j] = i;
					break;
				} 
				//키가 큰 사람이 존재하는 경우
				else if(ans[j] == 0) {
					tall--;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			bw.write(ans[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
