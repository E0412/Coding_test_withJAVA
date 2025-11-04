package level_0;

import java.util.Scanner;

//특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
public class L0_66 {
	static String solution(String myString, String pat) {
		int end = myString.lastIndexOf(pat); //pat이 마지막으로 시작되는 인덱스 저장
		String answer = myString.substring(0, end + pat.length());

		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ms = sc.next();
		String p = sc.next();

		System.out.println(solution(ms, p));
	}
}
