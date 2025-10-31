package level_0;

import java.util.Scanner;

//특정한 문자를 대문자로 바꾸기
public class L0_61 {
	static String solution(String my_string, String alp) {
		String answer = "";
		String up = alp.toUpperCase();

		//해당하는 문자열이 있는경우 대문자로 변환
		answer = my_string.replace(alp, up);

		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ms = sc.next();
		String a = sc.next();

		System.out.println(solution(ms, a));
	}
}
