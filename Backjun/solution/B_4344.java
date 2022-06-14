package solution;

import java.util.Scanner;

public class B_4344 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] arr; //배열 생성
		int testcase = kb.nextInt(); //전체 입력 기준
		
		//2중 for문을 사용한다 
		for(int i = 0; i < testcase; i++ ) {
			int n = kb.nextInt(); //학생 수
			arr = new int[n];
			
			double sum = 0; //총합 변수
			
			//성적 입력
			for(int j = 0; j < n; j++) {
				int val = kb.nextInt(); 
				arr[j] = val;
				sum += val; //성적 누적 합
			}
			
			double avg = (sum/n); //평균 
			double count = 0; //평균을 넘는 학생 수
			
			//평균 넘는 학생의 비율
			for(int j = 0; j < n; j++) { 
				if(arr[j] > avg) {
					count++; 
				} //성적이 평균보다 높을 때 count
			}
			
			System.out.printf("%.3f%%\n", (count/n)*100); 
			//%를 출력하려면 두번 적어야한다
		}
	}
}

