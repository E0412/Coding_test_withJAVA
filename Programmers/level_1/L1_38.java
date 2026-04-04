package level_1;

//최소직사각형
public class L1_38 {
	public int solution(int[][] sizes) {
		int w = 0;
		int h = 0;

		//배열의 큰 값을 가로, 작은 값을 세로로 저장 후 가장 큰 값씩 저장 
		for(int i = 0; i < sizes.length; i++) {
			int n = sizes[i][0];
			int m = sizes[i][1];

			w = Math.max(w, Math.max(n, m));
			h = Math.max(h, Math.min(n, m));
		}
		return w * h;
	}
}
