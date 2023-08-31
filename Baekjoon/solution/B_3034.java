package solution;

import java.io.*;
import java.util.StringTokenizer;

//앵그리 창영
//성냥이 박스안에 들어갈 수 있으면 DA, 없으면 NE를 출력한다
public class B_3034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken()); //성냥의 개수
		int W = Integer.parseInt(st.nextToken()); //가로 
		int H = Integer.parseInt(st.nextToken()); //세로 

		for (int i = 1; i <= N; i++) {
			int input = Integer.parseInt(br.readLine()); //성냥의 길이

			//(가로 + 세로)의 제곱보다 성냥 길이의 제곱이 작은경우
			if((W * W) + (H * H) >= (input * input)) {
				bw.write("DA" + "\n");
			} else {
				bw.write("NE" + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
