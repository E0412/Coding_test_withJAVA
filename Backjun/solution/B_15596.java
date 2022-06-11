package solution;

//정수 n개의 합, 리턴형은 long
//함수로 푼다 -> main메서드 없이 리턴 
public class B_15596 {
		long sum(int[] a) {
			long sum = 0;

			for(int i = 0; i< a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
}
