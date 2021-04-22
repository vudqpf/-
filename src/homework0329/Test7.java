package homework0329;
import java.util.Scanner;

//한개의 수를 입력받은후, 그 값을 처음 10으로 빼고, 나올 결과를 다시 또 입력받은 수로 뺀다. 
//이렇게 여러번 빼어주었을때 그 결과가 음수가 나올때의 수행 횟수를 출력하는 프로그램을 만드시오?
//예) 3을 입력받았다면, 1회: 10-3=7,  2회: 7-3=4, 3회: 4-3=1, 4회: 1-3=-2       정답 : 4회
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		int temp=10, sum=0, count=0;
		
		System.out.print("숫자를 입력하세요?");
		int num = sc.nextInt();
		while(sw) {
			count++;
			sum = temp-num;
			System.out.println(temp+"-"+num+"="+sum);
			temp = sum;
			if(sum<0) sw=false;
		}
		System.out.println("정답 : "+ count+"회");
		sc.close();
	}
}
