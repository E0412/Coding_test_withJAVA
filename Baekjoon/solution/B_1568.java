package solution;

import java.io.*;

//새
public class B_1568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int time = 0;
		int bird = 1; 

		while(N > 0) {
			//새의 수가 불러야하는 수 보다 작은 경우
			if(N < bird) bird = 1; //다시 게임 시작

			N -= bird; 
			time++;
			bird++;
		}
		bw.write(time + "");
		bw.flush();
		bw.close();
	}
}
