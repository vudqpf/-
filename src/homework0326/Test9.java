package homework0326;

import java.util.Scanner;

//구구단문제 : 두수('시작단'과 '끝단')를 입력받아, 2중 for문을 사용하여 아래와 같이 출력될 수 있도록 프로그램을 만드시오.
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, temp, num;
		
		System.out.println("시작단을 입력하세요?  ");
		x = sc.nextInt();
		System.out.println("끝단을 입력하세요? ");
		y = sc.nextInt();
		if(x>y) {
			temp = x;
			x = y;
			y = temp;
		}
				
		for(int i=1; i<=10; i++) {
			for(int j=x; j<=y; j++) {
				System.out.print(j+" * " + i + " = " + (i*j)+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
