package solution;

import java.io.*;
import java.util.StringTokenizer;

//나는 학급회장이다
public class B_2456 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[4][4];


		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[1][Integer.parseInt(st.nextToken())]++; //후보 1번
			arr[2][Integer.parseInt(st.nextToken())]++; //후보 2번
			arr[3][Integer.parseInt(st.nextToken())]++; //후보 3번
		}

		//회장 후보 번호와 최고 점수 출력, 결정 못할시 0
		int max = -1;
		int m_cnt = 0; //최댓값 개수 
		int m_num = -1; 
		boolean check = false;

		for (int i = 1; i <= 3; i++) {
			int sum = arr[i][1] + 2 * arr[i][2] + 3 * arr[i][3];
			if(sum > max) {
				max = sum;
				m_cnt++;
				m_num = i; //i번 후보가 최댓값
			}
			//가장 큰 sum 값이 2개 이상일 때 
			else if (sum == max) {
				//새로운 후보의 3점 개수가 기존 후보보다 큰 경우 
				if(arr[m_num][3] < arr[i][3]) {
					m_num = i; //당선 후보 변경
					check = false;
				} 
				//3점 개수가 동점이고, 새로운 후보의 2점 개수가 큰 경우
				else if (arr[m_num][3] == arr[i][3] && arr[m_num][2] < arr[i][2]) {
					m_num = i;
					check = false;
				} 
				//동점자
				else if (arr[m_num][3] == arr[i][3] && arr[m_num][2] == arr[i][2]) {
					check = true;
				}
			}
		}

		if(!check) {
			bw.write(m_num + " " + max);
		} else {
			m_num = 0;
			bw.write(m_num + " " + max);
		}
		bw.flush();
		bw.close();
	}
}
