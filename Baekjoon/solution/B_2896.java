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

		int o = fruit[0] / ratio[0];
		int a = fruit[1] / ratio[1];
		int p = fruit[2] / ratio[2];
		
		int min = o < a ? o : a;
		min = min < p ? min : p;
		
		bw.write((fruit[0] - min * ratio[0]) + " " + (fruit[1] - min * ratio[1]) + " " + (fruit[2] - min * ratio[2]));
		bw.flush();
		bw.close();
	}
}
