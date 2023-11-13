package solution;

import java.io.*;
import java.util.StringTokenizer;

//럭비 클럽
public class B_2083 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			//처리하지 않는 입력
			if(name.equals("#") && age == 0 && w == 0) break;

			//나이가 17세보다 많거나 몸무게가 80kg 이상이면 성인
			if(age > 17 || w >= 80) {
				bw.write(name + " Senior\n");
			} else {
				bw.write(name + " Junior\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
