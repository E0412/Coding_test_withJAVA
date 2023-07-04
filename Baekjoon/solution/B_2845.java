package solution;

import java.io.*;
import java.util.StringTokenizer;

//파티가 끝나고 난 뒤 
/*
 * 각 신문 기사에 실려있는 참가자의 수가 몇 명 만큼 잘못되어있는지 구한다
 */
public class B_2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		int L = Integer.parseInt(st.nextToken()); //1m^2당 사람의 수
		int P = Integer.parseInt(st.nextToken()); //파티가 열렸던 곳의 넓이 
		
		int[] arr = new int[L];
		
		st  = new StringTokenizer(br.readLine());	
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); //참가자의 수 
		}

		//상근이가 계산한 참가자의 수와  각 기사에 적혀있는 참가자의 수의 차이 출력 
		
		bw.flush();
		bw.close();
	}
}
