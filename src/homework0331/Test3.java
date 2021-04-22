package homework0331;

import java.util.Scanner;

//2자리의 양의 정수를 입력받아 최대 99개안쪽으로 입력받아
//최대값과 최소값을 구하시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[99];
		int count = 0, max=0, min=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("2자리수 정수를 입력하시오? (종료:999)");
			arr[i] = sc.nextInt();
			count++;
			if(arr[i]== 999) break;
		}
		max = arr[0];
		min = arr[0];

		
		for(int i=1; i<count-1; i++) {	//어차피 0번째 배열에 넣으니까 1부터 돌려도 문제없음
			if(max<arr[i]) max = arr[i];
			else if(min>arr[i]) min = arr[i];
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		sc.close();
	}
}
