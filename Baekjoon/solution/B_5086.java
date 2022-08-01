package solution;

import java.io.*;
import java.util.*;

//배수와 약수
public class B_5086 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String factor = "factor\n"; //(factor + "\n")
		String multiple = "multiple\n";
		String neither = "neither\n";
		
		// 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());

			//둘 다 0일때는 출력없음 
			if(first == 0 && second == 0) break;
			
			//첫번째 숫자가 두번째의 약수
			if(second % first == 0) {
				bw.write(factor);
			} 
			//배수 
			else if(first % second == 0) {
				bw.write(multiple);
			} 
			//둘 다 아님(무관계)
			else {
				bw.write(neither);
			}
		}
		bw.flush();
		bw.close();
	}
}
