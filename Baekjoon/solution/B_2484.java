package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위 네개 
public class B_2484 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int money = 0; //최대 상금 

		for (int i = 0; i < N; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());

			int cnt = 0; //중복 횟수
			int dice = 0;
			int n_dice = 0;

			int[] arr = new int[4];
		}

		bw.flush();
		bw.close();
	}
}
