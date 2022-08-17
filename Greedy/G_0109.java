
//거스름돈(greedy)
//거슬러줘야 할 돈은 10의 배수여야 한다 
public class G_0109 {
	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coin = {500, 100, 50, 10};//화폐 타입 
		
		for (int i = 0; i < 4; i++) {
			int coins = coin[i];
			cnt += n / coins;//해당 화폐로 거슬러 줄 수 있는 동전의 개수 
			n %= coins;
		}
		System.out.println(cnt);
	}
}
