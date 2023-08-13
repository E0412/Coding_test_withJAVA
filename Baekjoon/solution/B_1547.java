package solution;

import java.io.*;
import java.util.StringTokenizer;

//공
/*
 * 공이 들어있는 컵의 번호를 출력한다.
 */
public class B_1547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine()); //컵의 위치를 바꾼 횟수
		int cup = 1; //컵의 위치 

		for (int i = 0; i < M; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());	
			int X = Integer.parseInt(st.nextToken()); //컵 
			int Y = Integer.parseInt(st.nextToken());

			if (cup == X) //컵의 위치가 같은 경우 
				cup = Y; //또 다른 컵의 번호가 공의 위치가 된다
			else if (cup == Y) cup = X; 
		}
		bw.write(cup + "");
		bw.flush();
		bw.close();
	}
}
