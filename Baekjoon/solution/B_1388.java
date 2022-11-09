package solution;

import java.util.*;
import java.io.*;


//바닥 장식(DFS)
/*  '-'와 '|'로 이루어진 바닥 장식 모양이 주어질 때,
 *  만약 두 개의 '-'가 인접해 있고, 같은 행에 있다면, 두 개는 같은 나무 판자이고, 
 *  두 개의 '|'가 인접해 있고, 같은 열에 있다면, 두 개는 같은 나무 판자이다.
 *  방 바닥을 장식하는데 필요한 나무 판자의 개수를 출력
 */
public class B_1388 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 

		int N = Integer.parseInt(st.nextToken()); //세로
		int M = Integer.parseInt(st.nextToken()); //가로

		char graph[][] = new char[N][M];

		int cnt = 0; //개수 

		//그래프에 나무판자 입력 
		for (int i = 0; i < N; i++) {
			String s = br.readLine();

			for (int j = 0; j < M; j++) {
				graph[i][j] = s.charAt(j);
			}
		}
		
		//2차원 배열 탐색
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// '|'가 위,아래로 이어져 있으면 한 개로 취급하여 개수에 더하지 않는다 
				if(i != 0 && graph[i][j] == '|' && graph[i - 1][j] == '|') {
					continue;
				} 
				// '-'가 좌,우로 이어져 있으면 한 개로 취급하여 개수에 더하지 않는다 
				if(j != 0 && graph[i][j] == '-' && graph[i][j - 1] == '-') {
					continue;
				}
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}

