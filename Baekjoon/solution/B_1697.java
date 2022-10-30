package solution;

import java.io.*;
import java.util.*;


//숨바꼭질
/*
 * 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다
 * 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동
 * 수빈이가 동생을 찾을 수 있는 가장 빠른 시간
 */
class Pnt {
	int x, y;

	public Pnt(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class B_1697 {

	static int N, M; //수빈이와 동생의 위치
	static int time; //동생을 찾는 최소시간 
	static boolean visited[][];
	static int graph[][];
	
	static void BFS() {
		Queue<Integer> q = new LinkedList<Integer>();
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		bw.flush();
		bw.close();
	}
}
