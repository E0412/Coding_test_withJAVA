package solution;

import java.io.*;

//큰 수 A+B
public class B_10757 {
	 public static void main(String args[]) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String a = br.readLine();
	        String b = br.readLine();
	        long A = Long.parseLong(a);
	        long B = Long.parseLong(b);
	        System.out.println(A+B);
	    }
}
