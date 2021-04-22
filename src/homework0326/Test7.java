package homework0326;

import java.util.Scanner;

//숫자를 받아 그 숫자까지의 팩토리얼을 구하세요 
//단, 1~n을 곱하지 않고 n ~ 1 을 곱하는 방식으로 출력형식까지 함께 출력합니다.
//예 : 5를 입력하면?  결과는  5 * 4 * 3 * 2 * 1 = 120
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력받아 그 수의 팩토리얼을 출력하려고한다.");
		System.out.print("수를 입력하세요? ");
		int num1 = sc.nextInt();
		int num2 = num1;
		int sum  = 1;
		
		for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				sum *= num2;
				if(num2 == 1) System.out.print(num2 +" = "+sum);
				else System.out.print(num2+" * ");
				num2--;
			}


		}
	}
}
