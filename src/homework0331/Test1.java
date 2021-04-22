package homework0331;
import java.util.Scanner;

//컴퓨터로부터 '두자리 임의의 수'를 지정받아, 그 수가 얼마인지를 알아맞추는 프로그램을 작성하시오.
//- 지정수보다 큰수를 입력했으면? 더 작은 수를 입력하세요.
//- 지정수보다 작은수를 입력했으면? 더 큰 수를 입력하세요.
//- 최종적으로 맞춘 횟수를 출력하시오.
//- 기회는 5번으로 한정합니다.
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*90)+10;
		boolean yn = true;
		int count=0, num=0;
		
		System.out.print("숫자를 입력하세요?(1~10사이의 수) 기회는 5번입니다.");
		num = sc.nextInt();
		while(yn) {
			count++;
			System.out.println("count = "+count);
			if(random>num) {
				System.out.print("큰 수를 입력하세요");
				num = sc.nextInt();
			}else if(random<num) {
				System.out.print("작은 수를 입력하세요");
				num = sc.nextInt();
			}
			if(random==num)	{
				System.out.println("맞았습니다. 총 "+count+"번 수행했습니다.");
				break;
			}
			if(count == 4) { //기회는 첫 num부터 시작하기 때문에 처음을 빼면 4번만 돌아가야됨
				System.out.println("기회를 다 사용하셨습니다. 정답은 "+random+"입니다.");
				break;
			}

		}
		sc.close();
	}
}
