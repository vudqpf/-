package homework0329;

//두개의 주사위를 던졌을때, 두 눈의 합이 6이 되는 경우는 어떤 경우가 있는지 모두 출력하는 프로그램을 작성하시오.
public class Test6 {
	public static void main(String[] args) {
		System.out.println("두개의 주사위를 던졌을때, 두 눈의 합이 6이 되는 경우는 아래와 같다");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if((i+j)==6) System.out.print("("+i+","+j+")\t");
			}
		}
	}
}
