package homework0408_1;
import java.util.Scanner;

public class LaundryMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Washing[] washing = {new JeilConpany(), new SamsongCompany(), new DajinCompany(), new LCCompany()};
		
		while(true) {
			System.out.println("세탁기를 선택해 주세요");
			System.out.print("0:종료 1:제일 2:삼송 3:대진 4:LC ->");
			int num = sc.nextInt();
			if(num==0) break;
			System.out.println("탈수시간을 입력해주세요(시간단위)");
			int time = sc.nextInt();
			washing[num-1].name();
			washing[num-1].basicFunction();
			washing[num-1].callimFuntion();
			washing[num-1].boilFunction();
			washing[num-1].dryFunction();
			washing[num-1].runningTime(time);
			System.out.println("==============================");
			
		}
	System.err.println("시스템 종료");
	sc.close();
	}

}
