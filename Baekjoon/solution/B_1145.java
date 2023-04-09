package solution;

import java.io.*;
import java.util.StringTokenizer;


//적어도 대부분의 배수
/*
 * 적어도 대부분의 배수는 자연수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다
 * 다섯 개의 자연수에서 적어도 대부분의 배수를 출력해야한다 
 */
public class B_1145 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 1; //나누어 떨어지는 숫자가 3개이상 존재하는 값
		int cnt = 0; //3개이상 나누어 떨어지는지 확인 

		while(true) {
			for (int i = 0; i < 5; i++) {
				//나누어 떨어지는 경우
				if(answer % arr[i] == 0) {
					cnt++; 
				}
			}
			//3개 이상인 경우 answer 반환
			if(cnt >= 3) {
				bw.write(answer + "");
				break;
			}
			cnt = 0;
			answer++;
		}
		bw.flush();
		bw.close();
	}
}
