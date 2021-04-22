package homework0324;

//1~100까지, 짝수합과 홀수합을 스위칭방법을 이용하여 코딩하시오.
public class Test3 {
	public static void main(String[] args) {
		int i=0, sw=0, odd=0, even=0;
		
		for(i=1; i<=100; i++) {
			if(sw == 0) {
				odd += i;
				sw = 1;
			}else {
				even += i;
				sw = 0;
			}
		}
		
		System.out.println("1~100까지 짝수의 합은 " +odd+ "입니다.");
		System.out.println("1~100까지 홀수의 합은 " +even+ "입니다.");
	}
}