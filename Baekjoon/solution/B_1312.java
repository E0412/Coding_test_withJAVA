package solution;

import java.io.*;
import java.util.StringTokenizer;

//소수
public class B_1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int A = Integer.parseInt(st.nextToken()); //분자
		int B = Integer.parseInt(st.nextToken()); //분모
		int N = Integer.parseInt(st.nextToken()); //소수점 아래 N자리 수

		//A / B를 했을 때 소수점 N번째 수 출력 
		int num = A % B; //나머지

		for (int i = 0; i < N - 1; i++) {
			num *= 10; //나머지에 10을 곱한다
			num %= B; //나머지를 구한다 
		}

		num *= 10; //구한  나머지에 10을 곱한다 

		bw.write(num / B + ""); //원하는 자리수에서 나누기를 하여 몫을 구한다
		bw.flush();
		bw.close();
	}
}
