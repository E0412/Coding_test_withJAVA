package solution;

import java.io.*;
import java.util.*;

//ABC
/*
 * A < B, B < C일 때 주어진 세 수를 주어진 출력 순서대로 출력한다 
 */
public class B_3047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr); //순서대로 정렬

		String in = br.readLine(); //알파벳 입력

		for (int i = 0; i < arr.length; i++) {
			if(in.charAt(i) == 'A') {
				bw.write(arr[0] + " ");
			} else if(in.charAt(i) == 'B') {
				bw.write(arr[1] + " ");
			} else if(in.charAt(i) == 'C') {
				bw.write(arr[2] + " ");
			}
		}
		bw.flush();
		bw.close();
	}
}
