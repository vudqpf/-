package homework0324;

import java.util.Scanner;

//5개의 수를 입력받아서 그중에서 가장 큰 수를 출력하세요.
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요");
		int num3 = sc.nextInt();
		System.out.print("네번째 숫자를 입력하세요");
		int num4 = sc.nextInt();
		System.out.print("다섯번째 숫자를 입력하세요");
		int num5 = sc.nextInt();
		
		int maxNum=0;
		
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5) maxNum = num1;
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) maxNum = num2;
		else if(num3>num2 && num3>num1 && num3>num4 && num3>num5) maxNum = num3;
		else if(num4>num2 && num4>num3 && num4>num1 && num4>num5) maxNum = num4;
		else maxNum = num5;
		
		System.out.println("입력받은 수 중 가장 큰 수는 "+maxNum+"입니다.");
	}
}
