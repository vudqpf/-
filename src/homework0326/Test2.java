package homework0326;

import java.util.Scanner;

//구구단의 '시작단'과 '끝단'을 사용자가 입력하여 화면에 출력시켜주는 프로그램을 작성하시오.
//즉, 첫번째 받는 수는 '시작단', 두번째 받는수는 '끝단'이 된다.  
//3과 5를 입력하면 3단, 4단, 5단을 출력한다. 
//입력받는 첫번째수가 두번째수보다 큰경우는 두개의 수를 바꾸어서 작은단부터 출력될 수 있도록 한다.
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, temp;
		
		System.out.print("시작단을 입력하세요?  ");
		x = sc.nextInt();
		System.out.print("끝단을 입력하세요? ");
		y = sc.nextInt();
		if(x>y) {
			temp = x;
			x = y;
			y = temp;
		}
				
		for(int i=x; i<=y; i++) {
			System.out.println(i+"단 시작");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * " + j + " = " + (i*j));
			}
			System.out.println();
		}
		sc.close();
	}
}
