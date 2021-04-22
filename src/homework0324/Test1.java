package homework0324;

import java.util.Scanner;

//점수를 입력받아 학점을 구하는 프로그램을 작성하시오
//처리조건 : 90이상은 A학점, 80이상은 B학점, 70이상은 C학점, 60이상은 D학점, 60미만은 F학점
//- Switch~case문 사용할것
//- 한번 처리후 계속할지의 여부를 물어보고 작업종료시는 n키나 N키를 눌러서 작업을 종료시키시오.
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean yorn = true;
		do {
			System.out.println("점수를 입력하세요? ");
			int point=sc.nextInt();
			String grade ="";
			
			switch (point) {
				case 100: grade = "A";
					break;
				case 90: grade = "A";
					break;
				case 80: grade = "B";
					break;
				case 70: grade = "C";
					break;
				case 60: grade = "D";
					break;
				default : grade = "F";
				break;
			}
			System.out.println("입력하신 학점은 " +grade+ "입니다");
			System.out.println("계속 진행하시겠습니까?(y/n)");
			String yn = sc.next();
			if(yn.equals("n")) 		yn = yn.toUpperCase();
			else if(yn.equals("y"))	yn = yn.toUpperCase();

			if(yn.equals("N")) yorn = false;
			else yorn = true;
				
		}while(yorn);
		System.out.println("종료되었습니다.");
		sc.close();
	}
}
