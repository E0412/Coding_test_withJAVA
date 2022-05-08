package theory;

//부분 집합 구하기(DFS)
//공집합은 출력하지 않는다 
public class S_0106 {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			for (int i = 0; i <= n; i++) {
				if(ch[i] == 1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp); //공집합 배제 
		} 
		else {
			ch[L] = 1;
			DFS(L+1); //왼쪽 가지
			ch[L] = 0;
			DFS(L+1); //오른쪽 가지
		}
	}
	public static void main(String[] args) {
		S_0106 T = new S_0106();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}
}
