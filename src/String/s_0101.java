package String;

import java.util.Scanner;

class s_0101 {
	//����� ���α׷��ӽ� ���
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
//		System.out.println(str+ " " + t);
		/*for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		}*/
		//���� for�� ��� �迭, �÷��� �����ӿ�ũ�� ������ str�� �ȵ�
		for(char x : str.toCharArray()) { //toCharArray string�� ���ڿ��� �и�(���ڹ迭)
			if(x==t) answer++;
		}
		return answer; 
	}
	public static void main(String[] args) {
	//�Է��� ���ع��(class�� Main)
		s_0101 T = new s_0101(); //���ؿ����� Main���� �Է�
		Scanner kb = new Scanner(System.in); //kb�� keyboard
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
		
		
	}

}
