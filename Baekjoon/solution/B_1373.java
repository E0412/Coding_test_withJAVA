package solution;

import java.io.*;

//2진수 8진수
public class B_1373 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		//2진수를 10진수로 
		int binaryToDec = Integer.parseInt(input, 2);

		//10진수를 8진수로
		String DecimalToOct = Integer.toOctalString(binaryToDec);

		bw.write(DecimalToOct); //이클립스에서는 제대로 출력되지만 백준에서 런타임에러 발생
		bw.flush();
		bw.close();
	}
}
