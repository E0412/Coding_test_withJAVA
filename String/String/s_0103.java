package String;

import java.util.Scanner;

//ù �ٿ� ���� �� �ܾ ����Ѵ� 
//���̰� �� �ܾ �������� ��� ���� ���ʿ� ��ġ�� �ܾ ���Ѵ� 
class s_0103 {
	public String solution(String str) {
		String answer = "";
		//index of�� subString ��� 
		int max = Integer.MIN_VALUE , pos; //���� ���������� �ʱ�ȭ
		while((pos = str.indexOf(' ')) != -1) { //���� �߰� ���ϸ� -1 ����
			String tmp = str.substring(0, pos); //0���� pos���� �߶�
			int len = tmp.length();
			if(len> max) { //������ �ȵ� 
				max=len;
				answer=tmp;
			} 
			str = str.substring(pos+1);
		}
		if(str.length()>max) answer=str; //������ �ܾ� ��� 
		return answer;
	}
	
	public static void main(String[] args) {
		s_0103 T = new s_0103();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //�� ���� �Է¹޾ƾ� ��
		System.out.println(T.solution(str));
	}

}
