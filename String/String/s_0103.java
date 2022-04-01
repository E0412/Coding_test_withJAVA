package String;

import java.util.Scanner;

//첫 줄에 가장 긴 단어를 출력한다 
//길이가 긴 단어가 여러개인 경우 가장 앞쪽에 위치한 단어를 말한다 
class s_0103 {
	public String solution(String str) {
		String answer = "";
		//index of와 subString 사용 
		int max = Integer.MIN_VALUE , pos; //가장 작은값으로 초기화
		while((pos = str.indexOf(' ')) != -1) { //띄어쓰기 발견 못하면 -1 리턴
			String tmp = str.substring(0, pos); //0부터 pos까지 잘라냄
			int len = tmp.length();
			if(len> max) { //같으면 안됨 
				max=len;
				answer=tmp;
			} 
			str = str.substring(pos+1);
		}
		if(str.length()>max) answer=str; //마지막 단어 출력 
		return answer;
	}
	
	public static void main(String[] args) {
		s_0103 T = new s_0103();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //한 줄을 입력받아야 함
		System.out.println(T.solution(str));
	}

}
