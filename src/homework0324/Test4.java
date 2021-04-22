package homework0324;

import java.util.Scanner;

//키보드를 통해서 '성명'/'국어점수'/'영어점수'/'수학점수'를 입력받은후, 입력된 학생에 대한 '총점'/'평균'/'학점'을 계산하여 '성명'과 함께 출력시키는 프로그램을 만드시오.
//- 학점의 조건은 1번문제와 같다.
//- 처리를 종료하고자 한다면 '성명'을 입력받을때 '999'를 입력받으면 종료시키는것으로 한다.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean yn = true;
		
		while(yn) {	
			System.out.print("학생의 이름은? (종료:999 진행:이름)");
			String name = sc.next();
			if(name.equals("999"))  {
				yn = false; 
				break;
			}
			else yn = true;
			
			System.out.print("국어점수는?");
			int kor = sc.nextInt();
			System.out.print("영어점수는?");
			int eng = sc.nextInt();
			System.out.print("수학점수는?");
			int mat = sc.nextInt();
			
			int tot = kor + eng + mat;
			int aver = tot/3;
			String grade;
			
			switch (aver) {
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
		System.out.println(name+" 학생의 학점");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+aver+"\t"+grade);
		}
		System.out.println("종료되었습니다.");
	}
}
