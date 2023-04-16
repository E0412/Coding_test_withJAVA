package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위
/*
 * 가장 높은 빈도로 나오는 세 주사위 합을 구한다
 * 답이 여러개인 경우 가장 합이 작은 것을 출력
 */
public class B_1233 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		int S3 = Integer.parseInt(st.nextToken());
		
		int[] s1 = new int[S1];
		int[] s2 = new int[S2];
		int[] s3 = new int[S3];
		
		for (int i = 0; i < s1.length; i++) {
			s1[i] = i++;
		}
		for (int i = 0; i < s2.length; i++) {
			s2[i] = i++;
		}
		for (int i = 0; i < s3.length; i++) {
			s3[i] = i++;
		}
		
		int answer = 0;
		int[] cnt = new int[S1 * S2 * S3];
		
		//배열이 더해지는 값이 나타날 때마다 cnt 배열에 값을 추가한다 
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				for (int k = 0; k < s3.length; k++) {
					cnt[s1[i] + s2[j] + s3[k]]++;
				}
			}
		}
		
		//가장 많이 발생하는 합
		
		bw.flush();
		bw.close();
	}
}
