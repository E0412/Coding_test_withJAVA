package level_1;

//x만큼 간격이 있는 n개의 숫자
public class L1_07 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long) x * (i+1); //형변환을 하지 않을시 테스트 13, 14 통과 불가 
		}
		return answer;
	}
}
