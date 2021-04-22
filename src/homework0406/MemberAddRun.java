package homework0406;

import java.util.Scanner;

public class MemberAddRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberAdd memberAdd = new MemberAdd();
		
		System.out.print("성명을 입력하세요?");
		String name = sc.next();
		memberAdd.setName(name);
		
		System.out.print("나이를 입력하세요?");
		int age = sc.nextInt();
		memberAdd.setAge(age);
		
		System.out.print("직업를 입력하세요?");
		String job = sc.next();
		memberAdd.setJob(job);
		
		memberAdd.infor();
		
		
		sc.close();
	}
}
