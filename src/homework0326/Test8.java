package homework0326;

//1~100까지의 소수를 출력
public class Test8 {
	public static void main(String[] args) {
		int count=0;
		
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=100; j++) {
				if(i%j==0 && i != j) break;
				else if(i == j) {
					System.out.print(" "+ i +" ");
					count++;
				}
			}
			if(count%10 == 0) System.out.println();
		}
	}
}
