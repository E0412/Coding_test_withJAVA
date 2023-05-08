package solution;

import java.io.*;

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

		String love = "LOVE";
		String non = "";
		int max = -1;

		for (int i = 0; i < N; i++) {
			String team = br.readLine();

			for (int j = 0; j < 4; j++) {
				int cnt = name.length() - name.replace(String.valueOf(love.charAt(j)), "").length();
				cnt += team.length() - team.replace(String.valueOf(team.charAt(j)), "").length();
				arr[j] = cnt; //값 저장
			}

			int ans = 1;
			for (int j = 0; j < 4; j++) {
				for (int k = j + 1; k < 4; k++) {
					ans *= arr[j] + arr[k];
				}
			}
		}

		bw.flush();
		bw.close();
	}
}
