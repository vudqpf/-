package homework0319;

import java.util.Scanner;

//두수를 입력받아 두수의 몫과 나머지를 구하시오.
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int num2 = sc.nextInt();

		int share = num1/num2;
		int rest  = num1%num2;
		
		System.out.println("입력받은 숫자의 몫은 " + share + "이며, 나머지는 " + rest + "이다.");
		
		sc.close();
	}

}
