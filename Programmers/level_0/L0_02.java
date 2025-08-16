package level_0;

import java.util.Scanner;

//대소문자 바꿔서 출력하기
public class L0_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();

		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);

			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else {
				ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}
}
