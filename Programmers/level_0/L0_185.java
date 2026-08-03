package level_0;

//겹치는 선분의 길이
public class L0_185 {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] arr = new int[201];

		for(int i = 0; i < 3; i++) {
			int start = lines[i][0];
			int end = lines[i][1];

			for (int j = start; j < end; j++) {
				arr[j + 100]++; //좌표 + 100 -> 마이너스 값 방지
			}
		}

		for (int i : arr) {
			if(i >= 2) {
				answer++;
			}
		}
		return answer;
	}
}
