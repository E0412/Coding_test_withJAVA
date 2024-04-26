package solution;

import java.io.*;

//벌집
public class B_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int room = 1; //최소 개수의 방
		int ran = 2; //범위

		if(N == 1) bw.write(1 + "");
		//벌집의 중앙 1에서 N번 방까지 몇 개의 최소 개수의 방을 지나가는지 계산
		while(ran <= N) {
			if(N > 1) {
				ran = ran * (6 * room);
				room++; 
			}
		}
		bw.write(room + "");
		bw.flush();
		bw.close();
	}
}
