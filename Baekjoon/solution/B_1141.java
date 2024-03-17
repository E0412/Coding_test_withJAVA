package solution;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

//접두사
public class B_1141 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];

		//입력
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		//내림차순으로 정렬
		Arrays.sort(arr, new Comparator<String>() {
			//문자열 길이를 기준으로 정렬한다
			public int compare(String n, String m) {
				return Integer.compare(n.length(), m.length());
			}
		});

		//접두사X 집합인 부분집합의 최대 크기를 출력

		bw.flush();
		bw.close();
	}
}
