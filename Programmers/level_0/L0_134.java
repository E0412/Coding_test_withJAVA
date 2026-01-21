package level_0;

//가까운 수
public class L0_134 {
	public int solution(int[] array, int n) {
		int answer = array[0];
		int min = Math.abs(n - array[0]);
		for (int i = 1; i < array.length; i++) {
			int next = Math.abs(n - array[i]);
			//가장 가까운 수 저장
			if(min > next) {
				min = next;
				answer = array[i];
			} 
			//값이 같은 경우 작은 수 저장
			else if (min == next) {
				answer = Math.min(array[i], answer);
			} 
		}
		return answer;
	}
}
