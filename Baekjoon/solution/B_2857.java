package solution;

import java.io.*;

//FBI
/*
 * 5명의 요원 중 FBI 요원을 찾는다
 */
public class B_2857 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String name[] = new String[10];

		for (int i = 0; i < 5; i++) {
			name[i] = br.readLine();
		}

		//요원이 없는 경우
		bw.write("HE GOT AWAY!");  


		bw.flush();
		bw.close();
	}
}
