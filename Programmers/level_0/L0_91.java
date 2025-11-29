package level_0;

//특별한 이차원 배열 2
public class L0_91 {
	public int solution(int[][] arr) {
		int answer = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] != arr[j][i]) {
					answer = 0;
					break;
				} 
			}
		}
		return answer;
	}
}
