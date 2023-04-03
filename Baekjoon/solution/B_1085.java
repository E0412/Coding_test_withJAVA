package solution;

import java.io.*;
import java.util.*;

//직사각형에서 탈출
/* 
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구한다
 */
public class B_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	
	
		//현재 좌표
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		//왼쪽 위 꼭짓점 
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int cnt = 0; //거리의 최솟값
		
		
		bw.flush();
		bw.close();
	}
}
