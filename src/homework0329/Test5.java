package homework0329;
import java.util.Scanner;
//1 - 2 + 3 - 4 + 5 - 6 +.........   
//이와 같은식으로 계속해서 값을 더해갔을때, 그 결과값이 100이상이 될때는 몇번째 숫자인지를 구하는 프로그램을 만드시오?
public class Test5 {
	public static void main(String[] args) {
		int result=0;
		int sw = 0, i=0;
		
		for(i=1; i<1000; i++) {
			 if(i%2 == 0)	sw = -1*i;
			 else sw = i;
			 result = result+sw;
			 
			 if(result>=100) break;
		 }
		System.out.println("1-2+3-4+5-6+..."+i+"="+result);
	}
}
