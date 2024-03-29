package solution;

import java.io.*;
import java.util.*;

//보물
/*
 * S의 값을 가장 작게 만들기 위해 A의 수를 재배열한다  
 * 단, B에 있는 수는 재배열하면 안 된다.
 */
public class B_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] A = new int[N];
		int[] B = new int[N];

		StringTokenizer st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A); //오름차순 정렬

		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(B); 

		int answer = 0;
		//A배열의 최소값과 B배열의 최대값을 곱한 후 더한다 
		for (int i = 0; i < N; i++) {
			answer += A[i] * B[N - 1 - i]; //B[N - 1]이 최대값
		}

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
