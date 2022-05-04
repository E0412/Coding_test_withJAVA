package theory;

//재귀함수 
public class R_0101 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1); //if문 없이 사용시 무한 반복
			System.out.println(n + " ");
		}
	}

	public static void main(String[] args) {
		R_0101 T = new R_0101();
		T.DFS(3);
	}
}
