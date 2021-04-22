package homework0322;

import java.util.Scanner;

//합계를 계산할 시작 숫자와 종료 숫자를 입력받아서 해당 숫자 범위의 합을 구하시오.
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 계산할 시작 숫자와 종료 숫자를 입력받아 합을 구하려고 한다. ");
		System.out.print("시작할 첫번째 숫자를 입력하시오? ");
		int num1 = sc.nextInt();
		System.out.print("종료할 두번째 숫자를 입력하시오? ");
		int num2 = sc.nextInt();
	
		int sum = 0;
		for(int i=num1; i<=num2; i++) 	sum += i;

		System.out.println(num1 + " ~ " + num2 + "까지의 합은 "+ sum +"입니다.");
		
		sc.close();
	}
}
