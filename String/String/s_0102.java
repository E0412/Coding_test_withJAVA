package String;

import java.util.Scanner;

public class s_0102 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) { //string�� ���ڿ� �迭�� ��ȯ
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //isLowerCase = character�� �ҹ����ϰ��
			else answer+=Character.toLowerCase(x); //�ҹ���->�빮�� �빮��->�ҹ���
		}
		return answer;
	}
	public static void main(String[] args) {
		s_0102 T = new s_0102();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
