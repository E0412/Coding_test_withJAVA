package level_0;

//팩토리얼
public class L0_154 {
	public int solution(int n) {
		int answer = 1;
		int idx = 1;
		//가장 가까운 작은 값 반환
		while(n >= answer) {
			idx++;
			answer *= idx;
		}
		return idx - 1;
	}
}
