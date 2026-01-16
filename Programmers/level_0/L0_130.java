package level_0;

//치킨 쿠폰 
public class L0_130 {
	public int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;
		while(coupon >= 10) { //10장 미만이 되면 종료
			int n = coupon / 10; //서비스 치킨
			answer += n;
			coupon = (coupon % 10) + n; //10으로 나눈 나머지와 서비스 치킨을 더하여 쿠폰의 수 갱신
		}
		return answer;
	}
}
