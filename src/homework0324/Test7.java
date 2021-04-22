package homework0324;

import java.util.Scanner;

//수를 입력받아서 입력받은수가 다음중 어느 배수('2'/'3'/'5'/'7'중에서)에 속하는지를 출력하시오.
//작업의 종료시는 999를 입력하여 종료하시오.
//- 16을 입력받으면?   2의 배수입니다.
//- 15를 입력받으면?   3의 배수입니다. 5의 배수입니다.
//- 35를 입력받으면?   5의 배수입니다. 7의 배수입니다.
//- 30을 입력받으면?   2의 배수입니다. 3의 배수입니다. 5의 배수입니다.
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean yn = true;
		
		while(yn) {
			System.out.println("숫자를 입력하세요.(종료:999)");
			int num = sc.nextInt();
			if(num ==999)	break;
			
			if(num%2 == 0) System.out.print("2의 배수입니다.\t");
			if(num%3 == 0) System.out.print("3의 배수입니다.\t");
			if(num%5 == 0) System.out.print("5의 배수입니다.\t");
			if(num%7 == 0) System.out.print("7의 배수입니다.\t");
			if((num%2 != 0) && (num%3 != 0) && (num%5 != 0) && (num%7 != 0)) System.out.print("2,3,5,7의 배수가 아닙니다.");
			System.out.println();
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}
}
