package homework0409_1;

import java.util.Scanner;

public class WasherRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"클린 세탁기","청정 세탁기", "그린 세탁기"};
		Washer[] washer = {new Clean(), new Purity(), new Green()};
		int select = 0;
		
		while(true) {
			System.out.println("세탁기를 선택(번호)하세요 (종료:0)");
			for(int i=0; i<name.length; i++) {
				System.out.print((i+1)+"번 "+name[i]+"  ");				
			}
			select = sc.nextInt();
			System.out.println("--------------------------------------");
			if(select==1 || select==2 || select==3) {
				washer[select-1].name(select-1);
				washer[select-1].washing();
				washer[select-1].rinsing();
				washer[select-1].dehydration();
				washer[select-1].dry();
				washer[select-1].ironing();
				System.out.println("--------------------------------------");
				washer[select-1].price();
				System.out.println("======================================");
			}else if(select==0) {
				System.out.println("시스템 종료");
				 break;
			}else {
				System.out.println("잘못선택하셨습니다 다시 선택하세요");
				System.out.println("------------------------------------");
			}
		}
		
	sc.close();
	}
}
