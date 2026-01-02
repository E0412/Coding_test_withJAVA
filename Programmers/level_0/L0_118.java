package level_0;

//저주의 숫자 3
public class L0_118 {
	public int solution(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num++;
			//3의 배수이거나 3이 포함되면 건너뛴다
			while(num % 3 == 0 || String.valueOf(num).contains("3")) {
				num++;
			}
		}
		return num;
	}
}
