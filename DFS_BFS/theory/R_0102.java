package theory;

//이진수 출력(재귀함수)
public class R_0102 {
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+ " ");
		}
	}
	public static void main(String[] args) {
		R_0102 T = new R_0102();
		T.DFS(11);
	}
}
