package solution;

import java.io.*;
import java.util.StringTokenizer;

//싸이클
public class B_2526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		int sum = ((N * N) % P);
		int cnt = 0;
		int[] arr = new int[1001]; //출력되는 수 저장 

		//1.먼저 N에 N을 곱한다 
		int one = N * N;
		//2.이 수를 P로 나눈 나머지를 출력한다
		int two = one % P;
		//3.나머지에 N을 곱하고 P로 나뭄 나머지를 출력한다(반복)
		int three = two * N % P;
		//만약 three = 이전에 나온 수 -> cnt++

		while(true) {

		}

	}
}
