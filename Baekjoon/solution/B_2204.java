package solution;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

//도비의 난독증 테스트
public class B_2204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N = Integer.parseInt(br.readLine());

			if(N == 0) break;

			String[] arr = new String[N];
			HashMap<String, String> map = new HashMap<String, String>();

			for (int i = 0; i < N; i++) {
				arr[i] = br.readLine();
			}
			//사전상 가장 앞서는 단어 찾기
			for (int i = 0; i < N; i++) {
				String s = arr[i].toLowerCase(); //비교를 위해 소문자로 단어 저장
				map.put(s, arr[i]); //소문자 문자열과 기존 문자열 저장
				arr[i] = arr[i].toLowerCase();
			}
			Arrays.sort(arr);
			bw.write(map.get(arr[0]) + "\n"); //사전상 가장 앞서는 단어 출력 
		}
		bw.flush();
		bw.close();
	}
}
