package level_0;

//주사위 게임 3
public class L0_28 {
	int solution(int a, int b, int c, int d) {
		int p = 0; //같은 숫자
		int q = 0; //다른 숫자
		int r = 0; //다른 숫자 2
		int sum = 0;

		//모두 같은 경우
		if(a == b && b == c && c== d) {
			p = a;
			sum = p * 1111;
		}

		//3개가 같은 경우
		if(a == b && b == c && c != d) { 
			p = a; q = d;
			sum = (int) Math.pow((10 * p + q), 2);
		} else if(a != b && b == c && c == d) { 
			p = b; q = a;
			sum = (int) Math.pow((10 * p + q), 2);
		} else if(a == b && b != c && a == d) { 
			p = a; q = c;
			sum = (int) Math.pow((10 * p + q), 2);
		} else if(a != b && a == c && a == d) {
			p = a; q = b;
			sum = (int) Math.pow((10 * p + q), 2);
		}	

		//2개씩 같은 경우
		if(a == b && b != c && c == d) { 
			p = a; q = c;
			sum = (p + q) * Math.abs(p - q);
		} else if(a == c && b != c && b == d) { 
			p = a; q = b;
			sum = (p + q) * Math.abs(p - q);
		} else if(a == d && d != b && b == c) { 
			p = a; q = b;
			sum = (p + q) * Math.abs(p - q);
		}

		//2개가 같고 각각 다른 경우
		if(a == b && b != c && b != d && c != d) { 
			p = a; q = c; r = d;
			sum = q * r;
		} else if(a != b && a == c && c != d && b != d) { 
			p = a; q = b; r = d;
			sum = q * r;
		} else if(a != b && a != c && a == d && b != c) {
			p = a; q = b; r = c;
			sum = q * r;
		} else if(a != b && b == c && c != d && a != d) {
			p = b; q = a; r = d;
			sum = q * r;
		} else if(a != b && b != c && c == d && a != c) {
			p = c; q = a; r = b;
			sum = q * r;
		} else if(a != b && a != c && c != b && b == d) {
			q = a; r = c;
			sum = q * r;
		}

		//모두 다른 경우 
		if(a != b && b != c && a != c && a != d && b != d && c != d) {
			int n = Math.min(a, b);
			int m = Math.min(c, d);
			sum = Math.min(n, m);
		}
		return sum;
	}
}
