package solution;

import java.io.*;
import java.util.*;

//줄 세우기
public class B_2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //학생의 수 

		ArrayList<Integer> list = new ArrayList<Integer>();

		StringTokenizer st  = new StringTokenizer(br.readLine());	
		for (int i = 1; i <= N; i++) {
			int input = Integer.parseInt(st.nextToken());
			list.add(input, i); //학생순서 리스트에 추가 
		}

		Collections.reverse(list); //리스트 뒤집기 
		for (int i = 0; i < N; i++) {
			bw.write(list.get(i) + " ");
		}

		bw.flush();
		bw.close();
	}
}
