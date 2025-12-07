package level_0;

//정사각형으로 만들기
public class L0_98 {
	public int[][] solution(int[][] arr) {
		int x = 0;
		int y = 0;

		for (int i = 1; i <= arr.length; i++) {
			x = i;
			for (int j = 1; j <= arr[i-1].length; j++) {
				y = j;
			}
		}
		int idx = Math.max(x, y);
		int[][] answer = new int[idx][idx];

		//Arrays.fill()도 사용가능
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer.length; j++) {
				answer[i][j] = 0;
			}
		}   
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				answer[i][j] = arr[i][j];
			}
		} 
		return answer;
	}
}
