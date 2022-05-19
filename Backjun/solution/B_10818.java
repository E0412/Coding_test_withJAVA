package solution;

import java.io.*;
import java.util.*;

//배열문제
//n개의 정수가 주어질때의 최대, 최솟값 구하기 
public class B_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //정수보다 먼저 선언되면 x
		int[] arr = new int[n];
		int index = 0;
		while(st.hasMoreTokens()) { //토큰이 있으면 true
			arr[index] = Integer.parseInt(st.nextToken());
			index++; //할당되었을때 인덱스증가 
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
