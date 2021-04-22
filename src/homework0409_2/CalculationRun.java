package homework0409_2;
import java.util.Scanner;
public class CalculationRun {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Vo vo = new Vo();
		Calculation calculation = new Calculation();
		int su1=0, su2=0;	
		while(true) {
			System.out.print("첫번째 숫자를 입력하세요? (종료:999)");		//1번째 숫자 입력
			String num1 = sc.next();
			if(num1.equals("999")) break;
			try {
				su1 = Integer.parseInt(num1);				//String을 int로 변환
			}catch(NumberFormatException e) {				//잘못되었을 시 들어갈 부분
				System.out.println("숫자형태가 아닙니다. 처음부터 다시 입력하세요");
				 System.out.println("-----------------------------------");
				continue;
			}
			vo.setNum1(su1);	//VO클래스에 넣기
			
			System.out.print("두번째 숫자를 입력하세요");;		//1번째 숫자 입력
			String num2 = sc.next();
			try {
				su2 = Integer.parseInt(num2);				//String을 int로 변환
			}catch(NumberFormatException e) {				//잘못되었을 시 들어갈 부분
				System.out.println("숫자형태가 아닙니다. 처음부터 다시 입력하세요");
				 System.out.println("-----------------------------------");
				continue;
			}
			vo.setNum2(su2);	//VO클래스에 넣기
			
			System.out.print("사칙연산을 고르세요? (예:+,-,*,/)");
			String cal = sc.next();
			 vo.setCalculation(cal);
			 System.out.println("-----------------------------------");
			 if(cal.equals("+")) calculation.plus(vo);
			 else if(cal.equals("-")) calculation.minus(vo);
			 else if(cal.equals("*")) calculation.multiply(vo);
			 else if(cal.equals("/")) calculation.divide(vo);
			 else {
				 System.out.println("잘못입력하셨습니다. 처음부터 다시 입력하세요");
				 continue;
			 }
			 System.out.println("===================================");
		}
		System.out.println("시스템 종료");
		sc.close();
	}
}
