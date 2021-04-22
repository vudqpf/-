package homework0322;

//1~100까지 숫자를 1씩 증가시키면서 수행하되, 
//3의 배수이거나, 5의 배수이거나, 7의 배수가 될때의 숫자를 어떤것들이 있는지 출력하고, 
//해당 조건에 맞는 숫자의 갯수는 몇개였는지 출력하시오.
public class Test10 {
	public static void main(String[] args) {
		
		int count3=0, count5=0, count7=0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.println(i+"은 3의 배수");
				count3++;
			}
			else if(i%5 == 0) {
				System.out.println(i+"은 5의 배수");
				count5++;
			}
			else if(i%7 == 0) {
				System.out.println(i+"은 7의 배수");
				count7++;
			}
			else System.out.println(i);
		}
		System.out.println("3의 배수의 갯수 : 총 " + count3 + "개");
		System.out.println("5의 배수의 갯수 : 총 " + count5 + "개");
		System.out.println("7의 배수의 갯수 : 총 " + count7 + "개");
	}
}
