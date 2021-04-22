package homework0319;

import java.util.Scanner;

//두수를 입력받아 큰수에서 적은수로 값을 나누어서 출력되는 결과를 소수이하 2자리까지 출력시키시오.
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오");
		double num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오");
		double num2 = sc.nextInt();
		
		if(num1 > num2){
			double answer = num1/num2;
			System.out.printf("입력하신 숫자를 나눈 결과는 %.2f 입니다.", answer);
		}else {
			double answer = num2/num1;
			System.out.printf("입력하신 숫자를 나눈 결과는 %.2f 입니다.", answer);
		}
		
		sc.close();
	}

}
