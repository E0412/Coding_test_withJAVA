package level_0;

//피자 나눠 먹기 (3)
public class L0_129 {
	public int solution(int slice, int n) {
		int answer = (n + slice -1) / slice;
		return answer;
	}
}
