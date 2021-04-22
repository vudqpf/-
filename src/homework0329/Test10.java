package homework0329;

// 2g, 3g, 5g의 추가 각각 5개씩 준비되어 있다.
//이 3개의 추를 조합하여, 무게가 30g ~ 35g 의 값이 될때의 각각의 추의 무게를 출력하는 프로그램을 만드시오?(마지막에 몇개가 있는지도 함께 개수를 출력하시오)
//예) 2g짜리 5개 + 3g짜리 5개 + 5g짜리 1개 = 30g (답이 될수있다)
public class Test10 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=2; i<=35; i+=2) {
			for(int j=3; j<=35; j+=3) {
				for(int k=5; k<=35; k+=5) {
					sum=i+j+k;
					if(sum>=30 && sum<=35) {
						System.out.print("2g짜리 "+(i/2)+"개 ,");
						System.out.print("3g짜리 "+(j/3)+"개 ,");
						System.out.print("5g짜리 "+(k/5)+"개 ,");
						System.out.println("= "+sum);
					}
				
				}
			}
		}
		
	}
}
