package level_1;

//대충 만든 자판
public class L1_60 {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];

		//4중 for문 이용
		for (int i = 0; i < targets.length; i++) {          // target 하나씩
			int sum = 0;

			for (int j = 0; j < targets[i].length(); j++) { // target의 문자 하나씩
				char ch = targets[i].charAt(j);
				int min = 101;

				for (int k = 0; k < keymap.length; k++) {   // keymap 하나씩
					for (int l = 0; l < keymap[k].length(); l++) { // keymap의 문자 하나씩
						if(ch == keymap[k].charAt(l)) {
							min = Math.min(min, l + 1); //0부터 시작해서 +1
							break; //찾으면 종료
						}
					}
				}
				//해당하는 문자를 못 찾은 경우 = min의 기본값
				if(min == 101) { 
					sum = -1;
					break;
				}
				sum += min; //횟수를 더함
			}
			answer[i] = sum;
		}
		return answer;
	}
}
