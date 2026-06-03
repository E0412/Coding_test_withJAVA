package level_1;

//2016년
public class L1_48 {
	public String solution(int a, int b) {
		String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int num = 0; //날짜 계산
		for(int i = 0; i < a - 1; i++) { //a월 이전까지 계산
			num += month[i];
		}
		return day[(num + b - 1) % 7]; //1월 1일은 제외
	}
}
