package solution;

import java.io.*;

//문자가 몇갤까
public class B_7600 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String s = br.readLine();

			if(s.equals("#")) {
				break;
			}

			char[] arr = s.toCharArray();
			int cnt = 0, sum = 0, flag = 0;

			for (int i = 65; i <= 90; i++) {
				for (int j = 0; j < arr.length; j++) {
					if((arr[j] == i) || (arr[j] == i + 32)) {
						if(flag == 0) {
							cnt++;
							flag = 1;
						}
					}
				}
				flag = 0;
				sum += cnt;
				cnt = 0;
			}
			bw.write(sum + "\n");
			bw.flush();
		}
		bw.close();
	}
}
