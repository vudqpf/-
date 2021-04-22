package homework0322;

import java.util.Scanner;

//1부터 ?까지 합계를 계산하려한다. 이때 ?(종료 숫자)를 입력받아서 1부터 종료 숫자까지의 합을 구하시오.
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 입력된 숫자까지의 합계를 구하려고 한다. \n숫자를 입력하시오? ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) sum += i;

		System.out.println("1부터 "+ num + "숫자 까지의 합은 "+ sum +"입니다.");
		
		sc.close();
	}
}
