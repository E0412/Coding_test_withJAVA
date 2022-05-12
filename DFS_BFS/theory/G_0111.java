package theory;
import java.util.*;

public class G_0111 {
		static int n, m, answer = 0;//static으로 변수선언 메인에서 접근받아야 해서 
		static int[][] graph;
		static int[] ch;
		public void DFS(int v) {
			if(v==n) answer++; //v가 n번 노드면 대답 
			else {
				for(int i = 1; i<=n; i++) { //i의 값이 n보다 같거나 작아야 6이 나옴 
					if(graph[v][i]==1 && ch[i]==0) {
						ch[i]= 1;
						DFS(i);
						ch[i]= 0; //체크 풀기					
					}
				}
			}
		}
		public static void main(String[] args) {
			G_0111 G = new G_0111();
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			m=sc.nextInt();
			graph = new int[n+1][n+1];//1번 인덱스부터 n번까지 정점 번호가 나와야 함 행과 열 
			ch = new int[n+1];//방문 여부 체크 
			for(int i = 0; i<m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph[a][b]= 1; //방향 그래프 a에서 b로 간다 1번만 선언 
			}
			ch[1] = 1;
			G.DFS(1);
			System.out.println(answer);
		}
	}
