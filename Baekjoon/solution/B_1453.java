package solution;

import java.io.*;
import java.util.StringTokenizer;

//피시방 알바
public class B_1453 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int cnt = 0; //거절당하는 사람의 수 
		
		StringTokenizer st  = new StringTokenizer(br.readLine());	
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] == arr[i + 1]) {
				cnt++;
			} else {
				bw.write(cnt + "");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
