package level_2;

//타겟 넘버
public class L2_05 {
	int answer = 0; //경우의 수
	//dfs 생성 
	void dfs(int numbers[], int target, int n, int sum) {
		//마지막 숫자까지 처리
		if(n == numbers.length) {
			//합계가 목표하는 숫자와 동일한 경우
			if(sum == target) {
				answer++; //경우의 수 추가
			}
			return;
		}
		//n(um)번째 숫자를 보고 현재 합 sum에 numbers[n] 더하거나 빼기
		dfs(numbers, target, n + 1, sum + numbers[n]); //현재 숫자를 더하는 경우
		dfs(numbers, target, n + 1, sum - numbers[n]); //현재 숫자를 빼는 경우
	}
	public int solution(int[] numbers, int target) {
		//numbers와 target과 0에서 시작하는 dfs 호출
		dfs(numbers, target, 0, 0);
		return answer;
	}
}
