package homework0319;

import java.util.Scanner;

//입력받은 1개의 점수가 90점 이상이면 'A'학점, 80점 이상이면 'B'학점, 70점 이상이면 'C'학점,
//60점 이상이면 'D'학점, 60점 미만이면 'F'학점, 이라고 출력하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();
		
		if(num >= 90)		System.out.println("\'A\'학점 입니다.");
		else if(num >= 80)	System.out.println("\'B\'학점 입니다.");
		else if(num >= 70)	System.out.println("\'C\'학점 입니다.");
		else if(num >= 60)	System.out.println("\'D\'학점 입니다.");
		else				System.out.println("\'E\'학점 입니다.");
		
		
		
		sc.close();
	}

}
