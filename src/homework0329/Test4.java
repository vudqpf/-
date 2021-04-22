package homework0329;
import java.util.Scanner;
//아래와 같이 출력되도록 2중 for문을 사용하여 만드시오.
//12345
//23456
//34567
//45678
//56789
public class Test4 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
