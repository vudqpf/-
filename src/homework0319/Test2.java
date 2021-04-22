package homework0319;

import java.util.Scanner;

//1개의 정수를 입력받아, 입력받은수가 짝수인지 음수인지를 출력하시오.
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오.");
		int num = sc.nextInt();
		
		int answer = num%2;
		if(answer == 0 && num >0) 	System.out.println("입력받은 숫자 " + num + "은  짝수 입니다.");
		else if(num < 0) 			System.out.println("입력받은 숫자 " + num + "은  음수 입니다.");
		else 						System.out.println("입력받은 숫자 " + num + "은  짝수도 음수도 아닙니다.");
		
		sc.close();
	}

}
