package level_0;

//옷가게 할인 받기
public class L0_115 {
	public int solution(int price) {
		if(price >= 100000 && price < 300000) {
			price = (int) (price * 0.95);
		} else if(price >= 300000 && price < 500000) {
			price = (int) (price * 0.9);
		} else if(price >= 500000) {
			price = (int) (price * 0.8);
		}
		return price;
	}
}
