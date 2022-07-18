import java.util.Scanner;

//삽입 정렬(인출 시간 계산)
public class S_0211 {
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);

		int N = kb.nextInt(); //사람 수 
		
		int arr[] = new int[N];//자리수로 구분하여 저장한 배열
		int arrSum[] = new int[N];//arr의 합배열
		
		for (int i = 0; i < N; i++) {
			arr[i] = kb.nextInt();
		}
		
		for (int i = 1; i < N; i++) { //삽입정렬, 1부터 시작
			int insert_point = i;
			int insert_value = arr[i];
			
			for (int j = i - 1; j >= 0; j--) {
				//현재 범위에서 삽입 위치 찾기
				if(arr[j] < arr[i]) {
					insert_point = j + 1;
					break;
				}
				if(j == 0) {
					insert_point = 0;
				}
			}
			//삽입을 위해 삽입 위치에서 i까지 데이터를 한 칸씩 뒤로 밀기
			for (int j = i; j > insert_point; j--) {
				arr[j] = arr[j-1];
			} 
			//삽입 위치에 데이터 할당 
			arr[insert_point] = insert_value;
		}
		
		//합배열 만들기
		arrSum[0] = arr[0];
		for (int i = 1; i < N; i++) { //1부터 시작 
			arrSum[i] = arrSum[i-1] + arr[i]; 
		}
		
		//합배열 총합 구하기 
		int sum = 0; //총합
		for (int i = 0; i < N; i++) {
			sum = sum + arrSum[i];
		}
		System.out.println(sum);
	}
}
