package homework0319;

import java.util.Scanner;

//길동이는 서점에서 책을 구입하려고 한다.  이때 길동이가 준비해간 금액을 입력받고, 서점에 배치된 a, b, c서적의 금액과 비교하여, 길동이가 준비한 금액으로 구매할 수 있는 책의 이름을 모두 출력하시오.
//(a책값: 2000원, b책값: 3000원, c책값: 5000원  이라고 한다면,
//길동이가 10000원을 준비했다면 'a', 'b', 'c'의 모든 책을 구매하고 '0원이 남는다'라고 출력하고,
//만약 9000원을 준비해갔으면, b와 c책을 구입할 수 있고, 1000원이 남았다고 출력~
//       6000원을 준비해갔으면 c책을 구입할 수 있고, 1000원이 남았다고 출력~
//       7000원을 준비해갔으면 c책, a책을 구입할 수 있고, 0원이 남았다~~   라고 출력하시오
//(단, 한줄이 아니라 여러줄에 출력해도 관계없음)
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("준비한 금액을 입력하시오");
		int totalMoney = sc.nextInt();
		
		int a = 2000, b = 3000, c = 5000;
		int aa 	= totalMoney - a;
		int bb 	= totalMoney - b;
		int cc 	= totalMoney - c;
		int cb 	= totalMoney - c - b;
		int ca 	= totalMoney - c - a;
		int cba = totalMoney - c - b - a;
		
		
		if(totalMoney >= 2000 && totalMoney <= 3000) System.out.println("a책을 구매할 수 있고, " + aa + "가 남았다.");
		else if(totalMoney > 3000 && totalMoney <= 5000) System.out.println("b책을 구매할 수 있고, " + bb + "가 남았다.");
		else if(totalMoney > 5001 && totalMoney <= 6000) System.out.println("c책을 구매할 수 있고, " + cc + "가 남았다.");
		else if(totalMoney > 6001 && totalMoney <= 7000) System.out.println("a책, c책을 구매할 수 있고, " + ca + "가 남았다.");
		else if(totalMoney > 8001 && totalMoney <= 9000) System.out.println("b책, c책을 구매할 수 있고, " + cb + "가 남았다.");
		else if(totalMoney >= 10000) System.out.println("a책, b책, c책을 구매할 수 있고, " + cba + "가 남았다.");
		else 				System.out.println("책을 구매할 수 없습니다.");
		
		
		sc.close();
	}

}
