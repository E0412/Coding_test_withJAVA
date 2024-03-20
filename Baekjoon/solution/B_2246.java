package solution;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//콘도 선정
public class B_2246 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		//HashMap으로 콘도 거리, 숙박비 저장
		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		/* X보다 바닷가에 더 가까운 콘도들은 모두 X보다 숙박비가 더 비싸다.
		 * X보다 숙박비가 더 싼 콘도들은 모두 X보다 바닷가에서 더 멀다.
		 */
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
			}
		}
		
		bw.flush();
		bw.close();
	}
}
