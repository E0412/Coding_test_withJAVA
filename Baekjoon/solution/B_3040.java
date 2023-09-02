package solution;

import java.io.*;

//백설 공주와 일곱 난쟁이
public class B_3040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9]; 
		int total = 0; //난쟁이 숫자의 합

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		for (int i = 0; i < 8; i++) {
			for (int j = i + i; j < 9; j++) {
				int fake = arr[i] + arr[j]; //가짜 난쟁이 숫자의 합
				
				//난쟁이 - 가짜 난쟁이의 값이 100이 되는 경우
				if(total - fake == 100) {
					arr[i] = 0; arr[j] = 0; //숫자를 찾으면 수를 0으로 바꿔준다
					
					for (int k = 0; k < 9; k++) {
						if(k != i && k != j) {
							bw.write(arr[k] + "\n");
						}
					}
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
