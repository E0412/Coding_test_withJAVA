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

		String name[] = new String[5];
		int cnt = 0;

		for (int i = 0; i < name.length; i++) {
			name[i] = br.readLine();
		}

		for (int i = 0; i < name.length; i++) {
			if(name[i].contains("FBI")) {
				bw.write(i + 1 + " ");
				cnt++;
			}
		}

		//요원이 없는 경우
		if(cnt == 0) {
			bw.write("HE GOT AWAY!");  
		}

		bw.flush();
		bw.close();
	}
}
