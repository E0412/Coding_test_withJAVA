package solution;

import java.io.*;
import java.util.Arrays;

//등수 매기기 
public class B_2012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		Arrays.sort(arr); //정렬

		int result = 0; //불만도 최소 합

		//불만도의 합 구하기 
		for (int i = 1; i <= N; i++) {
			//(예상 등수 - 실제 등수)의 절댓값의 합 저장 
			result += Math.abs(arr[i] - i); 
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
