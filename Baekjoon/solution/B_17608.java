package solution;

import java.io.*;

//막대기
/*
 * 보이는 막대기의 개수를 출력
 */
public class B_17608 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //막대기 개수 

		int[] arr = new int[N];
		int cnt = 1; //맨 나중에 입력한 값보다 크면 증가

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			//배열의 이전 값 < 현재 값 일 때 
			if(max < arr[i]) {
				max = arr[i]; //값 변경 
				cnt++; //개수 증가 
			}
		}	

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
