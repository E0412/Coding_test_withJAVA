package solution;

import java.io.*;
import java.util.StringTokenizer;

//부재중 전화
public class B_1333 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //노래의 개수
		int L = Integer.parseInt(st.nextToken()); //모든 노래의 길이
		int D = Integer.parseInt(st.nextToken()); //전화벨이 울리는 간격

		//전화가 오면 +1초 
		int time[] = new int[10000];
		int sec = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < L; j++) {
				time[sec++] = 1;
			}
			sec += 5; //노래와 노래 사이에는 5초의 간격이 있다
		}
		sec = 0;

		while(true) {
			if(time[sec] == 0) {
				bw.write(sec + "");
				break;
			}
			sec += D; //간격을 초에 추가
		}

		bw.flush();
		bw.close();
	}
}
