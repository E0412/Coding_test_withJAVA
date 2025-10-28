package level_0;

//1로 만들기
public class L0_59 {
	public int solution(int[] num_list) {
		int answer = 0;
		for(int i = 0; i < num_list.length; i++) {
			while(num_list[i] > 0) {
				if(num_list[i] == 1) {
					break;
				}
				//짝수일 때 반으로 나눈다
				else if(num_list[i] % 2 == 0) {
					num_list[i] /= 2;
					answer++;
				} 
				//홀수일 때 1을 빼고 반으로 나눈다
				else if(num_list[i] % 2 == 1) {
					num_list[i] = (num_list[i]-1)/2;
					answer++;
				} 
			}
		}
		return answer;
	}
}
