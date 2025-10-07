package level_0;

import java.util.Scanner;

//문자열의 뒤의 n글자
public class L0_37 {
	static String solution(String my_string, int n) {
		String answer = my_string.substring(my_string.length()-n);
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = sc.nextInt();

		System.out.println(solution(s, n));
	}
}
