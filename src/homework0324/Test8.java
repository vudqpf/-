package homework0324;

import java.util.Scanner;

//임의의 2자리 정수 '한개'를 프로그래머가 변수에 기억시켜두고, 프로그램을 실행시킨후, 사용자가 키보드를 통해서 수를 입력하여, 기존에 저장한 값을 알아맞히는 프로그램을 작성하시오.(난수를 발생해서 알아맞치는 프로그램이 아닙니다.)
//- 이때, 수를 입력받아 기존의 값보다 큰수를 입력받으면 '작은수를 입력하세요' 라는 메세지를 출력하고, 만약 기존 기억된 수보다 작은수를 입력하면 '큰수를 입력하세요'~ 라는 메세지가 나오면서 계속수행시키는데, 최종적으로 답을 찾을때까지 몇번 수행 하였는지를 카운트하여 그 횟수를 출력하시오.
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * 10)+1;
//		System.out.println(random);
		boolean yn = true;
		int count =0, num=0;
		
		System.out.print("숫자를 입력하세요?(1~10사이의 수)");
		num = sc.nextInt();
		while(yn) {
			count++;
			if(random>num) {
				System.out.print("큰 수를 입력하세요");
				num = sc.nextInt();
				continue;
			}else if(random<num) {
				System.out.print("작은 수를 입력하세요");
				num = sc.nextInt();
				continue;
			}else if(random==num)	{
				System.out.println("맞았습니다. 총 "+count+"번 수행했습니다.");
				break;
			}

		}
	sc.close();
	}
}
