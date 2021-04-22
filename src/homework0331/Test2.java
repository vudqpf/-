package homework0331;

//두개의 난수(1~6)를 발생시켜서 그 합이 6이 나왔을때의 수행횟수를 출력하시오.
public class Test2 {
	public static void main(String[] args) {
		boolean yn = true;
		int count=0;
		
		while(yn) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			int sum = num1+num2;
			System.out.println(num1+", "+num2);
			count++;
			if(sum == 6) {
				System.out.println("총 "+count+"회 수행했습니다.");
				yn = false;
			}
		}
	}
}
