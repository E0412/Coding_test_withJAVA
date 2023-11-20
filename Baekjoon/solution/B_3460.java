package solution;

import java.io.*;

//이진수
public class B_3460 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine()); //테스트케이스

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine()); 
			int cnt = 0; //1의 위치 구분변수

			while(n > 0) { 
				//나머지가 1인 경우 이진수로 나타냈을 때 1이 된다
				if(n % 2 == 1) {
					bw.write(cnt + " ");
				}
				cnt++; //그렇지 않은경우 1의 위치이동
				n /= 2;
			}
		}
		bw.flush();
		bw.close();
	}
}
