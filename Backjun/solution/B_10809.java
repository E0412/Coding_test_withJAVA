package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//알파벳 찾기
public class B_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] arr = new int[26];
		
		//배열의 기본값을 -1로 초기화 
		for(int i = 0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i); //입력받은 값을 검사 
			
			if(arr[ch-'a']==-1) {//-1인 경우 원소값을 초기화 
				arr[ch-'a'] = i;
			}
		}
		for(int answer : arr)
			System.out.print(answer + " ");
	}
}

