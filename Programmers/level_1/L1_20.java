package level_1;

//서울에서 김서방 찾기
public class L1_20 {
	public String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다";
			}
		}
		return ""; //IllegalArgumentException로 return문 생략 가능
	}
}
