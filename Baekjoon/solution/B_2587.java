package solution;

import java.io.*;
import java.util.Arrays;

//대표값2
public class B_2587 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		bw.write(sum/5 + ""); //평균
		bw.write("\n");

		Arrays.sort(arr); //정렬

		bw.write(arr[2] + ""); //중앙값 출력
		bw.flush();
		bw.close();
	}
}
