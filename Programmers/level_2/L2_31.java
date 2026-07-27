package level_2;

//피로도
public class L2_31 {

	int answer = 0; //최대 던전 수

	void dfs(int n, int cnt, int[][] arr, boolean visited[]) {

		//탐험한 던전 수가 최대인지 확인
		answer = Math.max(answer, cnt);

		//던전 확인
		for (int i = 0; i < arr.length; i++) {
			//이미 입장한 경우 패스
			if(visited[i]) continue;

			//현재 피로도(n)으로 갈 수 없는 던전이면 패스
			if(n < arr[i][0]) continue;

			//백트래킹
			visited[i] = true; //던전 입장 

			//던전 탐험 후 피로도 감소, 
			dfs(n - arr[i][1], cnt + 1, arr, visited);

			visited[i] = false;//다른 경우의 수를 고려하여 리셋
		}
	}

	public int solution(int k, int[][] dungeons) {

		boolean visited[] = new boolean[dungeons.length];

		dfs(k, 0, dungeons, visited); //현재 피로도, [최소 피로도, 소모 피로도], 던전 방문 여부

		return answer;
	}
}
