package solution;

import java.io.*;
import java.util.*;

//구간 합 구하기
public class B_11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Snum = Integer.parseInt(st.nextToken()); //입력 데이터의 개수
		int Qnum = Integer.parseInt(st.nextToken()); //배열의 개수 
		long arr[] = new long[Snum+1]; //배열 선언 
		st = new StringTokenizer(br.readLine());
		
		//구간 합을 구할 배열 입력 
		for(int i = 1; i<=Snum; i++) { //인덱스 1번부터 반복 
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		//구간 합을 구하는 코드 
		for(int k = 0; k<Qnum; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());//배열의 범위 1
			int j = Integer.parseInt(st.nextToken());//배열의 범위 2
			System.out.println(arr[j]-arr[i-1]);
		}
	}
}
