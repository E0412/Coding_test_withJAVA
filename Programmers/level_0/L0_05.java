package level_0;

import java.util.Scanner;

//문자열 돌리기
public class L0_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}
}
