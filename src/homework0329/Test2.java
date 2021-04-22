package homework0329;
import java.util.Scanner;
//주민등록번호(중간에 하이폰(-)없이 연속된 13자리 정수)를 입력받은후, 7번째 위치한 값이
//1 이면 '2000년 이전에 출생한 남자',
//2 이면 '2000년 이전에 출생한 여자',
//3 이면 '2000년 이후에 출생한 남자',
//4 이면 '2000년 이후에 출생한 여자'
//라고 출력시켜주는 프로그램을 만드시오?(앞의 다중조건문에서 배웠던 charAt()메소드 사용)
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean jumin = true;
		
		while(jumin) {
			System.out.println("주민등록번호(13자리)를 입력하세요?");
			char num = sc.next().charAt(6);
			String result;
			
			if(num == '1') 		result = "2000년 이전에 출생한 남자입니다.";
			else if(num == '2') result = "2000년 이전에 출생한 여자입니다. ";
			else if(num == '3') result = "2000년 이후에 출생한 남자입니다.";
			else if(num == '4') result = "2000년 이후에 출생한 여자입니다.";
			else result = "잘못입력하셨습니다"; jumin = false;
		System.out.println("입력하신 번호는 "+result);
		}
		sc.close();
	}
}
