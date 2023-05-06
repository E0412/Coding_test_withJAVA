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
		
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			String team = br.readLine();
			
		}
		
		bw.flush();
		bw.close();
	}
}
