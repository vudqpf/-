package homework0319;

import java.util.Scanner;

//시간을 분으로 입력받아서 '시간'과 '분'으로 출력하는 프로그램을 만드시오.
//예)  '70'분을 입력하면 '1시간 10분' 이라고 출력한다.
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분을 입력하시오");
		int time = sc.nextInt();
		
		
		System.out.println((time/60) + "시간\t" + (time%60) + "분");
		
		sc.close();
	}

}
