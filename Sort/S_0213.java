import java.io.*;

//기수정렬(Radix sort)
//큐를 이용하며 자릿수만 비교한다 
public class S_0213 {
	public static int[] arr;
	public static long result;
	
	public static void Radix(int[] arr, int max) {
		int[] output = new int[arr.length];
		int index = 1;
		int cnt = 0;
		
		//최대 자릿수만큼 반복 
		while(cnt != max) {
			int[] dist = new int[10]; //자릿수들의 분포를 합 배열의 형태로 알려준다 
			for (int i = 0; i < arr.length; i++) {
				dist[(arr[i]/index) % 10]++; //일의 자리부터 시작 
			}
			//합배열을 이용하여 인덱스 계산 
			for (int i = 1; i < 10; i++) {
				dist[i] += dist[i - 1]; 
			}
			//현재 자릿수를 기준으로 정렬
			for(int i = arr.length - 1; i >= 0; i--) {
				output[dist[(arr[i]/index) % 10] - 1] = arr[i];
				dist[(arr[i]/index) % 10]--;
			}
			//다음 자릿수를 이동하기 위해 현재 자릿수 기준 정렬 데이터 저장
			for (int i = 0; i < arr.length; i++) {
				arr[i] = output[i]; 
			}
			index = index * 10; //자릿수 증가 
			cnt++;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Radix(arr, 5);
		for (int i = 0; i < N; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
