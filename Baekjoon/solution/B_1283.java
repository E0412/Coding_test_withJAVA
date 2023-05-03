package solution;

import java.io.*;
import java.util.HashMap;

//단축키 지정
public class B_1283 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String s = new String();
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			s = br.readLine(); 
		}

		String[] str = s.split(" "); //여러 단어로 이루어진 문자열
		boolean check = true; //단축키 중복 체크 

		for (String in : str) {
			char ch = in.charAt(0);
			char low = Character.toLowerCase(ch); //소문자로 변환

			//단축키가 없는 경우
			if(check && map.getOrDefault(low, 0) == 0 && low != ' ') {
				map.put(low, 1);
				bw.write("[" + ch + "]" + in.substring(in.indexOf(ch) + 1));
				check = false; //중복처리
			}
		}

		bw.flush();
		bw.close();
	}
}
