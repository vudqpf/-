package homework0326;

import java.util.Scanner;

//          *
//        * * *
//      * * * * *
//	  * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("마름모의 가장 큰 수(홀수)를 입력하세요? ");
		int x = sc.nextInt();

		for(int i=1; i<=x; i+=2) {
			for(int j=i; j<x; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=x; i+=2) {
			for(int j=1; j<i+2; j++) {
				System.out.print(" ");
			}
			
			for(int j=i+2; j<=x; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();
	}
}
