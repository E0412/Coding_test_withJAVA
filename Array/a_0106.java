import java.util.ArrayList;
import java.util.Scanner;

//뒤집은 소수
public class a_0106 {
		public boolean isPrime(int num) {
			if(num==1) return false;
			for(int i= 2; i<num; i++) {
				if(num%i==0) return false;
			}
			return true;
		}
		public ArrayList<Integer> solution(int n, int[] arr) {
			ArrayList<Integer> answer = new ArrayList<>();
			for(int i = 0; i<n; i++) {
				int tmp = arr[i];
				int res = 0;
				while(tmp>0) {
					int t = tmp%10;
					res = res*10+t;
					tmp = tmp/10;
				}
				if(isPrime(res)) answer.add(res);
			}
			return answer;
		}
	
	public static void main(String[] args) {
		a_0106 T = new a_0106();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) { //ArrayList를 받음
			System.out.println(x+" ");
		}
	}

}
