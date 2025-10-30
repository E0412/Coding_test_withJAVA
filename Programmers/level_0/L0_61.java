package level_0;

import java.util.Scanner;

//특정한 문자를 대문자로 바꾸기
public class L0_61 {
	static String solution(String my_string, String alp) {
		String answer = "";
		String up = alp.toUpperCase();

		//해당 문자열이 없는경우 my_string 반환
		if(!my_string.contains(alp)) {
			answer = my_string;
		}
		//해당하는 문자열이 있는경우 대문자로 변환
		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) == alp.charAt(0)) {
				answer = my_string.replace(my_string.charAt(i), up.charAt(0));
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ms = sc.next();
		String a = sc.next();

		System.out.println(solution(ms, a));
	}
}
