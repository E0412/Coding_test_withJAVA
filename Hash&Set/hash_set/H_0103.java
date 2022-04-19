package hash_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//매출액의 종류 
public class H_0103 {
	public ArrayList<Integer> solution(int n, int m, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
		for(int i = 0; i<m-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0; //sliding window
		for(int rt = 0; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]); //중요
			lt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		H_0103 T = new H_0103();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, m, arr)) System.out.println(x + " ");
	}

}
