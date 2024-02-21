package solution;

import java.io.*;

//완전 세제곱
/*
 * 완전 세제곱 방정식과 a ≤ 100을 만족하는 {a, b, c, d}쌍을 모두 찾는 프로그램을 작성한다
 */
public class B_4690 {
	public static void main(String[] args) throws IOException {
		//입력이 없는 문제 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= a; b++) {
				for (int c = b; c <= a; c++) {
					for (int d = c; d <= a; d++) {
						//완전 세제곱 방정식인 {a,b,c,d} 쌍 출력
						int ta = a * a * a;
						int tb = b * b * b;
						int tc = c * c * c;
						int td = d * d * d;

						if(ta == tb + tc + td)
							bw.write("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ") \n");
					}
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
