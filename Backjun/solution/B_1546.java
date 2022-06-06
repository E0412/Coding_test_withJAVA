package solution;

import java.io.*;
import java.util.*;

//배열 입력받은 후 입력 받은 값 a, b 최고값을 b라고 할 때 a/b*100
public class B_1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		double sum = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		System.out.print(sum/arr.length);
	}
}
