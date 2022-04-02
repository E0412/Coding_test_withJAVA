package String;

import java.util.Scanner;

public class s_0105 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1; //index�� 0�̱⶧���� -1�� �ؾ��Ѵ�
		while(lt<rt) {
			if(! Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s); //s��� �⺻�� �����͸� String���� ��ȯ
		return answer;
	}
	public static void main(String[] args) {
		s_0105 T = new s_0105();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
