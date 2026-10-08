package level_1;

//[1차] 다트 게임
public class L1_66 {
	public int solution(String dartResult) {
		int answer = 0;

		//#, * 옵션의 경우도 계산 필요
		for(int i = 0; i < dartResult.length(); i++) {
			//숫자이면
			if(Character.isDigit(dartResult.charAt(i))) {
				int j = i + 1;  //다음 인덱스
				int n = dartResult.charAt(i) - '0';
				//10인 경우, 범위를 벗어나지 않도록 검증
				if(j < dartResult.length() && Character.isDigit(dartResult.charAt(j))) {
					n = 10;
					j++;
				}
				//보너스 
				if(j < dartResult.length() && Character.isAlphabetic(dartResult.charAt(j))) {
					if(dartResult.charAt(j) == 'S') {
						answer += n;
					} else if(dartResult.charAt(j) == 'D') {
						answer += (int) Math.pow(n, 2);
					} else {
						answer += (int) Math.pow(n, 3); 
					}
				}
				i = j; //검증된 값까지 변경
			}
		}
		return answer;
	}
}
