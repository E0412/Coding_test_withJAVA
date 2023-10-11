package solution;

import java.io.*;

//완전제곱수
/*
 * M과 N이 주어질 때 M이상 N이하의 자연수 중 완전제곱수인 것을 모두 골라 그 합을 구하고 
 * 그 중 최솟값을 찾는 프로그램을 작성한다
 */
public class B_1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE; //최소값
		int sum = 0;
		for (int i = 1; i * i <= N; i++) {
			//i의 제곱수가 범위 안에 있는 경우
			if(i * i >= M && i * i <= N) {
				min = Math.min(i * i, min); //최솟값 저장
				sum += i * i; //완전제곱수의 합
			}
		}
		//완전제곱수가 없는 경우
		if(sum == 0) {
			bw.write(-1 + "");
		} else {
			bw.write(sum + "\n" + min);
		}
		bw.flush();
		bw.close();
	}
}
