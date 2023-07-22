package solution;

import java.io.*;
import java.util.StringTokenizer;

//무알콜 칵테일
public class B_2896 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int[] fruit = new int[3];
		int[] ratio = new int[3];
		
		for (int i = 0; i < 3; i++) {
			fruit[i] = Integer.parseInt(st.nextToken());
		}
		
		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			ratio[i] = Integer.parseInt(st.nextToken());
		}

		//칵테일을 최대한 만들었을 때 남는 주스의 양
		
		bw.flush();
		bw.close();
	}
}
