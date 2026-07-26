package level_2;

//피로도
public class L2_31 {
	int answer = 0;

	int dfs(int n, int cnt, int[][] arr, boolean visited[]) {

		for (int i = 0; i < arr.length; i++) {
			if(visited[i]) continue;
			
			visited[i] = true; //던전 입장 
		}
		
		return n;
	}

	public int solution(int k, int[][] dungeons) {

		boolean visited[] = new boolean[dungeons.length];
		
		dfs(k, 0, dungeons, visited);

		return answer;
	}
}
