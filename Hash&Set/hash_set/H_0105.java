package hash_set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//K번째 큰 수 
public class H_0105 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
			int cnt = 0;
			for(int x : tset) {
				cnt++;
				if(cnt == k) return x;
//				System.out.println(cnt + " - " + x); //x가 몇번째인지 확인 
			}
			return answer;
		}
	
	public static void main(String[] args) {
		H_0105 T = new H_0105();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}

}
