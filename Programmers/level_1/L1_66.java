package level_1;

//[1차] 다트 게임
public class L1_66 {
	public int solution2(String dartResult) {
		int answer = 0;
		int prev = 0; //이전 숫자

		for(int i = 0; i < dartResult.length(); i++) {
			//숫자이면
			if(Character.isDigit(dartResult.charAt(i))) {
				int j = i + 1;  //다음 인덱스
				int n = dartResult.charAt(i) - '0'; //현재 숫자
				int tmp = 0; //임시 값

				//10인 경우, 범위를 벗어나지 않도록 검증
				if(j < dartResult.length() && Character.isDigit(dartResult.charAt(j))) {
					n = 10;
					j++;
				}
				//보너스 계산
				if(j < dartResult.length() && Character.isAlphabetic(dartResult.charAt(j))) {
					if(dartResult.charAt(j) == 'S') {
						tmp = n;
					} else if(dartResult.charAt(j) == 'D') {
						tmp = (int) Math.pow(n, 2);
					} else {
						tmp = (int) Math.pow(n, 3); 
					}
					//*, # 검증
					int k = j + 1;
					if(k < dartResult.length() && (dartResult.charAt(k) == '*' || dartResult.charAt(k) == '#')) {
						//직전 라운드 점수에도 적용되어야함
						if(dartResult.charAt(k) == '*') {
							answer -= prev;
							tmp *= 2;
							prev *= 2;
							answer += prev;
						} 
						//-1을 곱한다
						else {
							tmp *= -1;
						}
						j = k; //실행된 경우 인덱스 변경
					}
				}
				i = j; //검증된 값까지 인덱스 변경
				prev = tmp;
				answer += tmp;
			}
		}
		return answer;
	}
}
