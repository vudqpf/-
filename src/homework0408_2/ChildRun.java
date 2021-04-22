package homework0408_2;

import java.util.Scanner;

public class ChildRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LunchMenu[] lunchMenus = {new Child1(), new Child1()};
		String[] name = new String[3];
		
		
		int num = sc.nextInt();
		while(true) {
			System.out.println("아이의 이름을 입력하세요");
			for(int i=0; i<name.length; i++) {
				
			}
			if(num==0) {
				System.out.println("시스템 종료");
				break;
			}else if(num==1) {
				System.out.println("메뉴를 고르세요");
				lunchMenus[num-1].order();
				int su = sc.nextInt();
				lunchMenus[num-1].calculation(su);	
				System.out.println("디저트를 고르세요");
				su = sc.nextInt();
				lunchMenus[num-1].dessertorder();
				
			}
			
		}
		
		sc.close();
	}
}
