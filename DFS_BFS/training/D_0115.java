package training;

import java.util.ArrayList;
import java.util.Scanner;

//피자 배달 거리(DFS, 조합)
class Point4 {
	public int x, y;
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class D_0115 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point4> pz, hs;
	
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0;
			for(Point4 h : hs) {//좌표
				int dis = Integer.MAX_VALUE;
				for(int i : combi) { //조합의 인덱스번호 i
					dis = Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y)); 
			//집의 x 좌표 - 살아남은 피자집 pz.get(i).x의 인덱스 좌표 + 집의 y좌표-pz.y == 거리값 
				}
				sum += dis; //도시의 피자 배달 거리 
			}
			answer = Math.min(answer, sum); //최소값 구하기 
		} else {
			for (int i = s; i < len; i++) {
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		D_0115 T = new D_0115();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { //행과 열
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point4(i, j));
				else if(tmp == 2) pz.add(new Point4(i, j));
			}
		}
		len = pz.size(); //피자집의 개수 
		combi = new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
