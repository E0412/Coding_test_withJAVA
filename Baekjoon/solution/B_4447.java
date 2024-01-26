package solution;

import java.io.*;

//좋은놈 나쁜놈
public class B_4447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		while(N-- > 0) {
			String hero = br.readLine();
			int G = 0;
			int B = 0;

			//'g'가 더 많으면 좋은 놈. 'b'가 더 많으면 나쁜 놈
			for (int i = 0; i < hero.length(); i++) {
				if(hero.charAt(i) == 'g' || hero.charAt(i) == 'G') {
					G++;
				} else if(hero.charAt(i) == 'b' || hero.charAt(i) == 'B') {
					B++;
				}
			}
			// 'g'와 'b'의 개수에 따라 “GOOD”, “A BADDY”, “NEUTRAL”  중 하나를 출력
			if(G == B) {
				bw.write(hero + " is NEUTRAL\n");
			} else if(G < B) {
				bw.write(hero + " is A BADDY\n");
			} else {
				bw.write(hero + " is GOOD\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
