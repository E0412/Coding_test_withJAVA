package solution;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//창고 다각형
public class B_2304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[1001];

		int s = Integer.MAX_VALUE; //시작점
		int e = 0; //끝점
		int ans = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()); //위치
			int H = Integer.parseInt(st.nextToken()); //높이

			arr[L] = H; 
			s = Math.min(L, s); //시작점은 가장 작은값
			e = Math.max(L, e); //끝점 = 큰 값
		}

		Stack<Integer> in = new Stack<Integer>();

		//왼쪽 비교
		int tmp = arr[s];
		for (int i = s + 1; i < e; i++) {
			if(arr[i] < tmp) {
				in.push(i);
			} else {
				while(!in.isEmpty()) {
					int n = in.pop();
					arr[n] = tmp;
				}
				tmp = arr[i];
			}
		}
		in.clear(); //스택 초기화

		//오른쪽
		tmp = arr[e];
		for (int i = e - 1; i >= s; i--) {
			if(arr[i] < tmp) {
				in.push(i);
			} else {
				while(!in.isEmpty()) {
					int n = in.pop();
					arr[n] = tmp;
				}
				tmp = arr[i];
			}
		}

		for (int i = s; i <= e; i++) {
			ans += arr[i];
		}

		bw.write(ans + "\n");
		bw.flush();
		bw.close();
	}
}
