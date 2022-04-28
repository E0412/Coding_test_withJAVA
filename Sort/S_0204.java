import java.util.Scanner;

//LRU(캐시) 
public class S_0204 {
	public int[] solution(int size, int n , int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) {
			int pos = -1;
			for(int i = 0; i<size; i++) if(x==cache[i]) pos = i;
			if(pos == -1) {
				for(int i = size-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			} else {
				for(int i = pos; i>=1; i--) {
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}

	public static void main(String[] args) {
		S_0204 T = new S_0204();
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i]= kb.nextInt();
		for(int x : T.solution(m, n, arr)) System.out.print(x+" ");
	}

}
