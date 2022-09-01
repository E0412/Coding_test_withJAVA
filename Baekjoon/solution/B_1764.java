package solution;
import java.io.*;
import java.util.*;

//듣보잡(HashSet)
/*
 * 듣보잡의 수와 명단을 사전순으로 출력한다 
 * 중복을 허용하지 않는 set을 이용한다 
 */
public class B_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;

		HashSet<String> set = new HashSet<String>();
		//듣도 못한 사람 
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		//보도 못한 사람
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if(set.contains(s)) {
				list.add(s);
				cnt++;
			}
		}
		Collections.sort(list);
		bw.write(cnt + "\n");
		//리스트 -> 문자열로 출력 
		for(String answer : list) {
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();
	}
}