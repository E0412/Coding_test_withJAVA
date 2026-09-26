package level_1;

//체육복
public class L1_65 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] arr = new int[n];

		//여벌이 있으면 2, 도난당하면 0, 둘 다 해당하면 1 저장
		for(int i = 0; i < n; i++) {
			arr[i] = 1;

			for(int j = 0; j < reserve.length; j++) {
				if(i+1 == reserve[j]) {
					arr[i] = 2;
					break;
				}
			}
			for(int j = 0; j < lost.length; j++) {
				if(i+1 == lost[j]) {
					if(arr[i] == 2) {
						arr[i] = 1;
						break;
					} else {
						arr[i] = 0;
						break;
					}
				}
			}
		}

		//체육복 분배
		for(int i = 0; i < n; i++) {
			//왼쪽에서 빌리는 케이스
			if(i > 0 && arr[i - 1] == 2) {
				if(arr[i] == 0) {
					arr[i] = 1;
					arr[i - 1] = 1;
				}
			}
			//오른쪽
			else if(i < n - 1 && arr[i + 1] == 2) {
				if(arr[i] == 0) {
					arr[i] = 1;
					arr[i + 1] = 1;
				}
			}
		}
		for(int i : arr) {
			if(i >= 1) answer++;
		}

		return answer;
	}
}
