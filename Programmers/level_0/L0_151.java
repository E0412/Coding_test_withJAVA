package level_0;

//직사각형 넓이 구하기
public class L0_151 {
	public int solution(int[][] dots) {
		int wmin = dots[0][0];
		int wmax = dots[0][0];
		int lmin = dots[0][1];
		int lmax = dots[0][1];

		for(int i = 1; i < dots.length; i++) {
			wmin = Math.min(wmin, dots[i][0]);
			wmax = Math.max(wmax, dots[i][0]);
			lmin = Math.min(lmin, dots[i][1]);
			lmax = Math.max(lmax, dots[i][1]);
		}

		return (wmax - wmin) * (lmax - lmin);
	}
}
