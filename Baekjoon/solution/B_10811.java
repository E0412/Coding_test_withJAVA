package solution;

import java.io.*;
import java.util.StringTokenizer;

//바구니 뒤집기 
/*
 * 바구니의 순서를 역순으로 바꾸고 모든 순서를 출력
 */
public class B_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //바구니 개수 
		int M = Integer.parseInt(st.nextToken()); //순서를 바꿀 바구니

		int arr[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st  = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());

			//순서 바꾸기 
			while(I < J) {
				int tmp = arr[I];
				arr[I++] = arr[J];
				arr[J--] = tmp;
			}
		}

		for (int i = 1; i <= N; i++) {
			bw.write(arr[i] + " ");
		}

		bw.flush();
		bw.close();
	}
}
