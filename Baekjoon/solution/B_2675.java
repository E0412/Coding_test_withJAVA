package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자열 반복
public class B_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" "); //공백을 제거하여 입력받기
			int R = Integer.parseInt(str[0]); //0번 인덱스 값
			String s = str[1]; //1번 인덱스 값
			for (int j = 0; j < s.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
