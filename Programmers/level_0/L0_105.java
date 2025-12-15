package level_0;

import java.util.Scanner;

//모음 제거
public class L0_105 {
	static String solution(String my_string) {
		String answer = my_string.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ms = sc.next();
		System.out.println(solution(ms));
	}
}
