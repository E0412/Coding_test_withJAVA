package String;

import java.util.Scanner;
  
public class Test {
	public String solution(String str) {
		  String answer = "YES";
		    int len = str.length();
		    str = str.toUpperCase();
		    for(int i = 0; i<len/2; i++) {
		    if(str.charAt(i) != str.charAt(len-i-1)) answer = "NO";
		    }
		    return answer;
		  }
		  
		  public static void main(String[] args){
			Test T = new Test();
		    Scanner in =new Scanner(System.in);
		    String str = in.next();
		    System.out.println(T.solution(str));
		  }
		}