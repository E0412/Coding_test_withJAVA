package solution;

import java.io.*;
import java.util.StringTokenizer;

//음계
/* 1부터 8까지 차례대로 연주한다면 ascending
 * 8부터 1까지 차례대로 연주한다면 descending
 * 둘 다 아니라면 mixed 출력
 */
public class B_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int[] arr = new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean asc = true;
		boolean des = true;
		
		for (int i = 0; i < arr.length; i++) {
			//연주 순서
		}
		
		if(asc) {
			bw.write("ascending");
		} else if(des) {
			bw.write("descending");
		} else {
			bw.write("mixed");
		}
		
		bw.flush();
		bw.close();
	}
}
