package homework0329;
import java.util.Scanner;
//두 수와, 연산자(+,-,*,/,%)를 입력받아 계산하는 프로그램을 만드시오.
//(단, 연산자가 앞의 5개 외의 연산자로 입력되면 작업을 끝내도록 한다. 
//이때 연산에 참여한 수행 횟수를 출력하면서 작업을 마친다.)
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean yeon = true;
		int count=0, sum=0;
		
		while(yeon) {
			System.out.println("첫번째 숫자를 입력하세요?");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요?");
			int num2 = sc.nextInt();
			System.out.println("연산자(+,-,*,/,%)를 입력하세요?(종료:그 외 연산자)");
			String su = sc.next();
			
			if(su.equals("+")) 	{
				sum = num1+num2;	count++;
			}
			else if(su.equals("-")) {
				sum = num1-num2;	count++;
			}
			else if(su.equals("*")) {
				sum = num1*num2;	count++;
			}
			else if(su.equals("/")) {
				sum = num1/num2;	count++;
			}
			else if(su.equals("%")) {
				sum = num1%num2;	count++;
			}
			else 					{
				System.out.println("수행 횟수 : "+count);	yeon = false;
			}
			System.out.println(num1 + su + num2 + "=" + sum);	
		}
		System.out.println("시스템 종료");
		sc.close();
	}
}
