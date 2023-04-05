package solution;

import java.io.*;

//나누기
/*
 *  정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다
 *  마지막 두 자리를 모두 출력한다. 한자리이면 앞에 0을 추가한다
 */
public class B_1075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); 
		int F = Integer.parseInt(br.readLine()); 
		
		int answer = 0;
		
		//N의 마지막 2자리를 임의로 바꿔서 N / F = 0 이 되게 해야한다 
		
		
		bw.flush();
		bw.close();
	}
}
