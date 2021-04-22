package homework0319;

import java.util.Scanner;

//Green회사의 급여를 계산하려고 한다.
//급여는 실제 수령받는 실수령액을 구하는데, 이때 입력받는 값은 '성명'과 '본봉'과 '야근시간'을 입력받는다.
//이 회사의 야근수당은 1시간당 15000원이다.
//또한 공제금액을 계산해야 하는데, 공제액은 받는 금액(본봉+야근수당)에서 10%를 세금으로 제외한다고 한다.
//이 회사의 받게 되는 '실수령액'을 구하시오.('성명, 본봉, 야근수당, 공제액, 실수령액' 모두를 출력하시오.)
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성함을 입력하시오");
		String name = sc.next();
		System.out.print(name + "의 본봉을 입력하시오");
		int salary = sc.nextInt();
		System.out.print(name + "의 야근시간을 입력하시오");
		int overtime = sc.nextInt() * 15000;
		
		double tax = (salary + overtime) * 0.1;
		double payment = (salary + overtime) - tax;
		
		System.out.println("이름 : " + name);
		System.out.printf("본봉 : %d원\n" , salary);
		System.out.printf("야근수당 : %d원\n" , overtime);
		System.out.printf("공재액 : %.0f원\n" , tax);
		System.out.printf("실수령액 : %.0f원\n" , payment);
		
		sc.close();
	}

}
