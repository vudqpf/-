package homework0406;

import java.util.Scanner;

public class MemberAddRun_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberAdd_2 memberAdd2 = null;
		MemberAdd_2[] memberArr2 = new MemberAdd_2[100];
		int cnt = 0;
		
		//자료 입력받은후 객체로 배열에 저장하기
		while(true) {
			cnt++;
			System.out.print("성명을 입력하세요?(종료시:999)");
			String name = sc.next();
			if(name.equals("999")) break;
			System.out.print("나이를 입력하세요?");
			int age = sc.nextInt();			
			System.out.print("직업를 입력하세요?");
			String job = sc.next();
			memberAdd2 = new MemberAdd_2(name, age, job);
			memberArr2[cnt-1] = memberAdd2;
		}
		System.out.println("=========================");
		
		//메소드호출하여 출력처리
		System.out.println("(출력) 전체 처리건수 : "+(cnt-1));
		System.out.println();
		for(int i=0; i<cnt-1; i++) {
			System.out.println("**  회원 정보 **");
			System.out.println("성명 : "+memberArr2[i].getName()+", 나이 : "+memberArr2[i].getAge());
			System.out.println("직업 : "+memberArr2[i].getJob());
		}
		
		

		
		
		sc.close();
	}
}
