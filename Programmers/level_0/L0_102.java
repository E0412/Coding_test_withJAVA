package level_0;

//삼각형의 완성조건 (2)
public class L0_102 {
	public int solution(int[] sides) {
		int min = Math.min(sides[0], sides[1]);
		int max = Math.max(sides[0], sides[1]);

		int answer = 0;
		//가장 긴 변이 max인 경우 
		for(int i = (max - min + 1); i <= max; i++) {
			if(i + min > max) {
				answer++;
			}
		}
		//나머지 한 변이 가장 긴 변인 경우 
		for(int i = (max + 1); i < min + max; i++) {
			answer++;
		}
		return answer;
	}
}
