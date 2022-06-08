import java.util.Arrays;
import java.util.Scanner;

//동전교환 (냅색 알고리즘)
public class D_0105 {
	static int n, m;
	static int[] dy;
	public int solution(int[] coin) {
		Arrays.fill(dy, Integer.MAX_VALUE);//dy 배열을 큰 숫자로 초기화 
		dy[0] = 0;
		for(int i = 0; i<n; i++) { //n=동전의 개수
			for(int j = coin[i]; j<=m; j++) {
				dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
			}
		}
		return dy[m];
	}
	public static void main(String[] args) {
		D_0105 T = new D_0105();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]= kb.nextInt(); 
		}
		m = kb.nextInt();
		dy = new int[m+1]; //인덱스 번호 
		System.out.println(T.solution(arr));
	}
}
