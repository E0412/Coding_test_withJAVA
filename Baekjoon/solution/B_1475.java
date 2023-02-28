package solution;

import java.io.*;
import java.util.Arrays;

//방 번호(구현)
/*
 * 숫자의 중복이 있는경우 세트에 + 1
 * 6과 9는 뒤집어서 사용가능하다 
 */
public class B_1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String in = br.readLine();

		int arr[] = new int[10]; 
		
		for (char ch : in.toCharArray()) {
			int cnt = ch - '0';
			
			if(cnt == 9) {
				cnt = 6;
			}
			arr[cnt]++;
		}
		
		//6과 9는 교환가능 -> 2로 나눈다
		arr[6] = arr[6] / 2 + arr[6] % 2;
		
		Arrays.sort(arr);
		
		bw.write(arr[9] + ""); //마지막 요소 출력 
		bw.flush();
		bw.close();
	}
}
