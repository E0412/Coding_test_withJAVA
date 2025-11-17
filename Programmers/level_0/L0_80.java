package level_0;

import java.util.Arrays;

//문자열 묶기
public class L0_80 {
	public int solution(String[] strArr) {
		int[] arr = new int[strArr.length];
		int cnt = 0;
		int answer = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = strArr[i].length();
		}

		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				cnt++;
			} else { //값이 다른 경우
				answer = Math.max(answer, cnt);
				cnt = 1; //초기화
			}
		}
		answer = Math.max(answer, cnt); 
		return answer;
	}
}
