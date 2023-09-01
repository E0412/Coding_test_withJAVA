package solution;

import java.io.*;

//백설 공주와 일곱 난쟁이
public class B_3040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9]; 
		int total = 0; //난쟁이 숫자의 합
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		
		
		bw.flush();
		bw.close();
	}
}
