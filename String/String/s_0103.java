package String;

import java.util.Scanner;

//첫 줄에 가장 긴 단어를 출력한다 
//길이가 긴 단어가 여러개인 경우 가장 앞쪽에 위치한 단어를 말한다 
class s_0103 {
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE; //가장 작은값으로 초기화
		String[] s = str.split(" "); 
		for(String x : s) { //단어 분리
			int len = x.length();
			if(len>max) {
				max = len; //길이가 긴 것으로 교체
				answer = x; //단어 교체 
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		s_0103 T = new s_0103();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //한 줄을 입력받아야 함
		System.out.println(T.solution(str));
	}

}
