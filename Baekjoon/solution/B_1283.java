package solution;

import java.io.*;
import java.util.HashMap;

//단축키 지정
public class B_1283 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<Character, Integer> map = new HashMap<>();


		for (int i = 0; i < N; i++) {
			String s = br.readLine(); 

			StringBuilder sb = new StringBuilder();
			String[] str = s.split(" "); //여러 단어로 이루어진 문자열
			boolean check = true; //단축키 중복 체크 

			for (String in : str) {
				char ch = in.charAt(0);
				char low = Character.toLowerCase(ch); //소문자로 변환

				//단축키가 없는 경우
				if(check && map.getOrDefault(low, 0) == 0 && low != ' ') {
					map.put(low, 1);
					sb.append("[" + ch + "]" + in.substring(in.indexOf(ch) + 1) + " ");
					check = false; //중복처리
				}
				else {
					sb.append(in + " ");
				}
			}
			if(!check) {
				bw.write(sb + "\n");
			}
			else {
				String out = "";
				for (int j = 0; j < s.length(); j++) {
					char ch = s.charAt(j);
					char low = Character.toLowerCase(ch); //소문자로 변환

					//단축키가 없는 경우
					if(check && map.getOrDefault(low, 0) == 0 && low != ' ') {
						map.put(low, 1);
						out += "[" + ch + "]";
						check = false; //중복처리
					}
					else {
						out += ch;
					}
				}
				bw.write(out + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
