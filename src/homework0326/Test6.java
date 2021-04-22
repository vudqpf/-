package homework0326;

import java.util.Scanner;

//사용자로 부터 수를 입력받아 입력받는 수의 배수를 10개씩만 출력하시오.
//단 0이 입력되면 종료하게 한다.
//ㅇㅖ :  5 를 입력하면 출력되는 수는  5, 10, 15, 20, 25, 30, 35, 40, 45, 50
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력받아 그 수의 배수를 출력하려고한다.");
		System.out.print("수를 입력하세요? (종료:0)");
		int num = sc.nextInt();
		

			for(int i=1; i<=10; i++) {
				if(num == 0) break;
			    System.out.print(" "+(num*i)+" ");

			}

			sc.close();

	}
}
