package String;

import java.util.Scanner;

//ù �ٿ� ���� �� �ܾ ����Ѵ� 
//���̰� �� �ܾ �������� ��� ���� ���ʿ� ��ġ�� �ܾ ���Ѵ� 
class s_0103 {
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE; //���� ���������� �ʱ�ȭ
		String[] s = str.split(" "); 
		for(String x : s) { //�ܾ� �и�
			int len = x.length();
			if(len>max) {
				max = len; //���̰� �� ������ ��ü
				answer = x; //�ܾ� ��ü 
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		s_0103 T = new s_0103();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //�� ���� �Է¹޾ƾ� ��
		System.out.println(T.solution(str));
	}

}
