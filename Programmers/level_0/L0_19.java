package level_0;

import java.util.Scanner;

//수 조작하기 1
public class L0_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String control = sc.next();

		int n = 0;

		for (int i = 0; i < control.length(); i++) {
			if(control.charAt(i) == 'w') {
				n += 1;
			} 
			else if(control.charAt(i) == 's') {
				n -= 1;
			}
			else if(control.charAt(i) == 'd') {
				n += 10;
			}
			else if(control.charAt(i) == 'a') {
				n -= 10;
			}
		}
		System.out.println(n);
	}
}
