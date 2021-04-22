package homework0319;

import java.util.Scanner;

//두개의 정수를 입력받아 큰수와 적을 수를 출력하시오
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int num2 = sc.nextInt();//작은 수가 들어감
		
		if(num1 > num2) System.out.println("큰 수는 " + num1 + "이며, 작은 수는 " + num2 + "입니다.");
		else			System.out.println("큰 수는 " + num2 + "이며, 작은 수는 " + num1 + "입니다.");
		
		sc.close();
	}
}
