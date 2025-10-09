package level_0;

import java.util.Scanner;

//접미사인지 확인하기
public class L0_39 {
	static int solution(String my_string, String is_suffix) {
		int answer = 0;

		for (int i = 0; i < my_string.length(); i++) {
			String s = my_string.substring(i);

			if(s.equals(is_suffix)) {
				answer = 1;
			} 
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ms = sc.next();
		String is = sc.next();

		System.out.println(solution(ms, is));
	}
}
