package homework0322;

import java.util.Scanner;

//구구단 출력하기?
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 단수를 입력하시오? ");
		int gugudan = sc.nextInt();
		
		System.out.println("~~~\t" + gugudan + "단 시작!\t~~~");
		for(int i=1; i<=10; i++) {
			System.out.println(gugudan + "X" + i + "=" + gugudan*i);
		}
		
		sc.close();
	}
}
