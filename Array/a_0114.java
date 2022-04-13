import java.util.*;

//공통 원소 구하기 투 포인터 사용 
public class a_0114 {
		public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
			ArrayList<Integer> answer = new ArrayList<>();
			//오름차순 정렬
			Arrays.sort(a);
			Arrays.sort(b);
			int p1 =0, p2 = 0;
			while(p1<n && p2<m) {
				if(a[p1] == b[p2]) {
					answer.add(a[p1++]);
					p2++;
				} else if(a[p1]<b[p2]) p1++;
				else p2++;
			} 
			return answer;
		}
	
	
	public static void main(String[] args) {
		a_0114 T = new a_0114();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i = 0; i<m; i++) {
			b[i] = kb.nextInt();
		}
		for(int x : T.solution(n, m, a, b)) System.out.println(x + " ");
		
	}

}
