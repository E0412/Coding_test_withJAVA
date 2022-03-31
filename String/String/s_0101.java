package String;

import java.util.Scanner;

class s_0101 {
	//출력은 프로그래머스 방식
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
//		System.out.println(str+ " " + t);
		/*for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		}*/
		//향상된 for문 사용 배열, 컬렉션 프레임워크가 들어가야함 str은 안됨
		for(char x : str.toCharArray()) { //toCharArray string을 문자열로 분리(문자배열)
			if(x==t) answer++;
		}
		return answer; 
	}
	public static void main(String[] args) {
	//입력은 백준방식(class가 Main)
		s_0101 T = new s_0101(); //백준에서는 Main으로 입력
		Scanner kb = new Scanner(System.in); //kb는 keyboard
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
		
		
	}

}
