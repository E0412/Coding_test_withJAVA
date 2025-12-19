package level_1;

import java.util.*;

//폰켓몬
public class L1_03 {
	//정렬로 푼 방식
	public int solution(int[] nums) {
		int num = 1; 
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] != nums[i]) {
				num++;
			}
		}
		int answer = Math.min(nums.length/2, num);
		return answer;
	}
	//set을 사용한 방식
	public int solution2(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i); //중복을 자동으로 무시 
		}
		return Math.min(nums.length/2, set.size());
	}
}
