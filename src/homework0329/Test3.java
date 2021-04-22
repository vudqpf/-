package homework0329;
import java.util.Scanner;
//두자리 숫자를 입력하여, 각각 입력된 숫자가 '2'의 배수의 개수, '3'의 배수의 개수, '5'의 배수의 개수, '7'의 배수의 개수, 
// 2/3/5/7의 배수가 아닌 나머지수의 개수를 구하시오.
//그리고 입력된 수중 앞의 조건에 맞는 배수의 합계도 각각 구하여, 해당 배수의 개수와 함께 출력하시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		int sum2=0, sum3=0, sum5=0, sum7=0;
		int countElse = 0,  count2=0, count3=0;
		int count5=0, count7=0;
		
		System.out.println("두자리 정수를 입력하세요? (종료:999)");
		while(sw) {
			int input = sc.nextInt();
			if(input==999) break;
			if(input%2 == 0) {
				count2++;
				sum2 += input;
			}if(input%3 == 0) {
				count3++;
				sum3 += input;
			}if(input%5 == 0) {
				count5++;
				sum5 += input;
			}if(input%7 == 0) {
				count7++;
				sum7 += input;
			}if(input!=2 && input!=3 && input!=5 && input!=7) countElse++;
		}
		System.out.println("2의 배수의 개수 : "+count2+", 합계 : "+sum2);
		System.out.println("3의 배수의 개수 : "+count3+", 합계 : "+sum3);
		System.out.println("5의 배수의 개수 : "+count5+", 합계 : "+sum5);
		System.out.println("7의 배수의 개수 : "+count7+", 합계 : "+sum7);
		System.out.println("그 외의 갯수"+count2);
		
		sc.close();
	}
}
