package solution;

import java.io.*;

//아!
public class B_4999 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String d = br.readLine(); //의사가 원하는 길이
		String p = br.readLine(); //재환이가 낼 수 있는 길이

		//의사가 요구하는 길이보다 짧은 경우 병원에 가야하므로 go, 그렇지 않은 경우 no
		if(d.length() >= p.length()) {
			bw.write("go");
		} else {
			bw.write("no");
		}

		bw.flush();
		bw.close();
	}
}
