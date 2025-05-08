package solution;

import java.io.*;
import java.util.StringTokenizer;

//인공지능 시계
public class B_2530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); //시
		int B = Integer.parseInt(st.nextToken()); //분
		int C = Integer.parseInt(st.nextToken()); //초

		int D = Integer.parseInt(br.readLine()); //요리하는데 필요한 시간

		C += D; //요리하는데 필요한 시간을 더한다
		B += (C / 60); //C의 값이 60이 넘으면 B에 더한다
		C %= 60; 
		A += (B / 60); //B의 값이 60이 넘으면 A에 더한다
		B %= 60;
		A %= 24; //24시가 넘는 경우 0시가 되어야 함 

		bw.write(A + " " + B + " " + C);
		bw.flush();
		bw.close();
	}
}
