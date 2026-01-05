package level_0;

import java.util.*;

//문자열 정렬하기 (2)
public class L0_120 {
	static String solution(String my_string) {
		//my_string을 소문자로 변환, 배열로 저장
		char[] ch = my_string.toLowerCase().toCharArray();
		Arrays.sort(ch); //정렬
		return new String(ch); //String으로 변환하여 반환
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ms = sc.next();
		System.out.println(solution(ms));
	}
}
