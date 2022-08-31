package solution;

import java.io.*;
import java.util.*;

//숫자카드(HashMap)
/*
 * 각 수가 적힌 숫자 카드를 가지고 있으면 1, 아니면 0을 출력한다 
 */
public class B_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine()); //상근이가 가진 숫자카드 
		int answer = 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//상근이가 가진 숫자 카드의 개수 
		for (int i = 0; i < N; i++) {
			map.put(Integer.parseInt(st.nextToken()), 1);
		}
		
		int M = Integer.parseInt(br.readLine()); 
		st = new StringTokenizer(br.readLine(), " ");
		//숫자 카드를 구분하는 반복문 
		for (int i = 0; i < M; i++) {
			int input = Integer.parseInt(st.nextToken());
			if(map.get(input) != null ) {
				answer = 1;
			} else {
				answer = 0;
			}
			bw.write(answer + " ");
		}
		bw.flush();
		bw.close();
	}
}
