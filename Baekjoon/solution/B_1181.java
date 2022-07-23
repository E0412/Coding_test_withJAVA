package solution;

import java.io.*;
import java.util.*;

//단어 정렬 
//사전순 정렬 == compareTo 활용
public class B_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		int N = Integer.parseInt(br.readLine());
		
		String[] sArr = new String[N];
		
		for (int i = 0; i < N; i++) {
			sArr[i] = br.readLine();
		}
		
		Arrays.sort(sArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				//단어의 길이가 같을 경우 
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else { //그 외 
					return s1.length() - s2.length();
				}
			}
		});

		sb.append(sArr[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			//중복되지 않는 단어만 출력
			if(!sArr[i].equals(sArr[i - 1])) {
				sb.append(sArr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
}
