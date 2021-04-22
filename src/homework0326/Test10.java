package homework0326;

import java.util.Scanner;

//예금, 출금, 조회, 종료를 제공하는 코드를 작성
public class Test10 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int count = 0;
		int ye = 0;
		int chul = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			balance = sc.nextInt();
			
			if(balance == 1) {
				System.out.print("예금액>");
				ye = sc.nextInt();
				count += ye;
			}else if(balance == 2) {
				System.out.print("출금액>");
				chul = sc.nextInt();
				count -= chul;
			}else if(balance == 3) {
				if(count == 0) System.out.println("잔액이 없습니다.");
				else System.out.println("현재 잔고는 "+count+"원 입니다.");
			}else if(balance == 4) {
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
