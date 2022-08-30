package solution;

import java.io.*;
import java.util.*;

//문자열 집합(HashMap)
/*
 * N개의 문자열로 이루어진 집합 S
 * M개의 문자열 중에서 집합 S에 포함된 것이 총 몇 개인지 구한다
 */
public class B_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //집합 S의 개수 입력
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//map을 할당 
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		//할당된 map과 동일하면 cnt++;
		for (int i = 0; i < M; i++) {
			String s = br.readLine(); //M개의 문자열 입력
			if(map.get(s) != null) {
				cnt++;
			}
		}
		System.out.println(cnt); //개수 출력 
	}
}
