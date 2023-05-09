package solution;

import java.io.*;
import java.util.Arrays;

//팀 이름 정하기
/*
 * 우승할 확률이 가장 높은 팀 이름 구하기
 */
public class B_1296 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String name = br.readLine(); //연두의 영어이름

		int N = Integer.parseInt(br.readLine()); //팀 이름 후보의 개수

		int arr[] = new int[4]; 
		int max = -1;

		String love = "LOVE";
		String ans = ""; //답을 저장할 빈 문자열

		for (int i = 0; i < N; i++) {
			String team = br.readLine();

			for (int j = 0; j < 4; j++) {
				int cnt = name.length() - name.replace(String.valueOf(love.charAt(j)), "").length();
				cnt += team.length() - team.replace(String.valueOf(love.charAt(j)), "").length();
				arr[j] = cnt; //값 저장
			}

			int sum = 1;
			for (int j = 0; j < 4; j++) {
				for (int k = j + 1; k < 4; k++) {
					sum *= arr[j] + arr[k];
				}
			}

			if(max == sum % 100 && ans != "") {
				String[] s = new String[2]; //단어를 저장하는 배열
				s[0] = ans; 
				s[1] = team; //팀명 저장
				//순서대로 정렬
				Arrays.sort(s);
				ans = s[0];
			}

			if(max < (sum % 100)) {
				max = sum % 100;
				ans = team;
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
	}
}
