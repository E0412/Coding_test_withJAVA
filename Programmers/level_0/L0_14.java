package level_0;

import java.util.Scanner;

//코드 처리하기
public class L0_14 {

	static String solution(String code) {
		String[] arr = code.split("");
		String answer = "";
		int mode = 0;

		for (int i = 0; i < arr.length; i++) {
			//arr[i]가 "1"일 때 mode 변경
			if(arr[i].equals("1") && mode == 0) {
				mode = 1;
			} else if(arr[i].equals("1") && mode == 1) {
				mode = 0;
			}
			//mode가 0이고, arr[i]가 "1"이 아니며 짝수인 경우 추가
			if(!arr[i].equals("1") && mode == 0 && i % 2 == 0) {
				answer += arr[i];

			} 
			//mode가 1이고, arr[i]가 "1"이 아니며 홀수인 경우 추가
			else if(!arr[i].equals("1") && mode == 1 && i % 2 == 1) {
				answer += arr[i];
			} 
		}
		//빈 문자열인 경우 EMPTY 반환
		if(answer.equals("")) answer = "EMPTY";

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();

		System.out.println(solution(in));
	}
}
