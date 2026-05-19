package level_0;

//다음에 올 숫자
public class L0_178 {
	public int solution(int[] common) {
		int answer = 0;
		int n = common[1] - common[0];
		int m = common[1] / common[0];

		//배열 크기가 2이하인 경우 오류 발생, 수정 필요
		if(common[1] * m == common[2]) {
			answer = common[common.length-1] * m;
		} else if(common[1] + n == common[2]) {
			answer = common[common.length-1] + n;
		}
		return answer;
	}
}
