package solution;

import java.io.*;
import java.util.*;

//대칭 차집합(HashSet)
/**
*  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 일 때, 
*  대칭 차집합의 원소의 개수는 1 + 3 = 4개가 된다 
*/
public class B_1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //A 집합
		int M = Integer.parseInt(st.nextToken()); //B 집합
		int cnt = 0;
		
		HashSet<Integer> A = new HashSet<Integer>();
		HashSet<Integer> B = new HashSet<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		for(int answer : A) {
			if(!B.contains(answer)) { //집합 B가 answer를 포함하지 않을 때 
				cnt++; //포함되지 않는 A 원소의 개수를 센다 
			}
		}
		for(int answer : B) {
			if(!A.contains(answer)) { //집합 A가 answer(B)를 포함하지 않을 때 
				cnt++; //포함되지 않는 B 원소의 개수를 센다 
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
