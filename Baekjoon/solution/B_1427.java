package solution;

import java.io.*;
import java.util.*;

//소트인사이드
public class B_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] cArr = br.readLine().toCharArray();
		
		Arrays.sort(cArr);
		
		for(int i = cArr.length - 1; i >= 0; i--) {
			System.out.print(cArr[i]);
		}
	}
}
