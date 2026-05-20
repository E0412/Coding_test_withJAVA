package level_0;

//다음에 올 숫자
public class L0_178 {
	public int solution(int[] common) {
		int answer = 0;

		//런타임 에러 발생 -> 인덱스간 차이를 비교
		if(common[1] - common[0] == common[2] - common[1]) {
			answer = common[common.length-1] + (common[1] - common[0]);
		} //등차 먼저 검사
		else if(common[1] / common[0] == common[2] / common[1]) {
			answer = common[common.length-1] * (common[1] / common[0]);
		}
		return answer;
	}
}
