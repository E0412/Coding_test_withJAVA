package solution;

import java.io.*;
import java.util.*;

//좌표 압축
//map 사용
public class B_18870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int[] origin = new int[N]; //원본 배열
		int[] sortArr = new int[N]; //정렬 합 배열
		//순위를 매길 해시맵 선언 
		HashMap<Integer, Integer> orderMap = new HashMap<Integer, Integer>();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			//정렬할 배열과 원본 배열에 값을 넣는다 
			sortArr[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		//정렬 할 배열과 원본 배열에 값을 넣어준다 
		Arrays.sort(sortArr);
		
		//정렬 된 배열을 돌면서 map에 할당
		int rank = 0;
		for(int k : sortArr) {
			//원소가 중복되지 않을 때만 map에 원소와 순위를 넣는다
			if(!orderMap.containsKey(k)) {
				orderMap.put(k, rank);
				rank++; //map에 할당 후 다음 순위를 가리킬 수 있도록++
			}
		}
		//원본 배열 원소에 대한 순위를 가져온다 
		for(int key : origin) {
			int ranking = orderMap.get(key); 
			bw.write(ranking + " ");
		}
		bw.flush();
		bw.close();
	}
}