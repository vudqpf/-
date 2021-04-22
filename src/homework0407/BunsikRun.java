package homework0407;

import java.util.Scanner;

public class BunsikRun {
	public static void main(String[] args) {
		Scanner sc 			= new Scanner(System.in);
		WangjaBunsik wang 	= new WangjaBunsik();
		Woojubunsik woo 	= new Woojubunsik();
		SeoulBunsik se 		= new SeoulBunsik();
		int su=0;
		
		while(true) {
			System.out.println("매장(번호)을 선택해주세요.");
			System.out.print("1:왕자분식, 2:우주분식 3:서울분식 4:종료");
			int num = sc.nextInt();
			
			if(num==1) {		//왕자분식 선택시
				wang.price();
				wang.local();
				su = sc.nextInt();
				wang.menu(su);
			}else if(num==2) {	//우주분식 선택시
				woo.price();
				woo.local();
				su = sc.nextInt();
				woo.menu(su);
			}else if(num==3) {	//서울분식 선택시
				se.price();
				se.local();
				su = sc.nextInt();
				se.menu(su);
			}else if(num==4) {	//종료선택시
				System.out.println("시스템 종료");
				break;
			}
		}
		sc.close();
	}
}
