package solution;

import java.io.*;

//뒤집기(문자열)
public class B_1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split("");
		int one = 0;  //문자열 1 
		int zero = 0;  //문자열 0 
		
		//첫번째 인덱스가 0일때 0 개수++
		if(arr[0].equals("0")) zero++;
		else one++; 
		
		for(int i = 1; i < arr.length; i++) {
			//0번 인덱스가 i번 인덱스가 같지 않을 때 
			if(!arr[i-1].equals(arr[i])) {
				//i번 인덱스가 0일 때 0 개수++;
				if(arr[i].equals("0")) zero++;
				else one++; //아닐시 1 개수++;
			}
		}
		//zero와 one 중 작은 값을 반환 
		System.out.println(Math.min(zero, one));
	}
}
