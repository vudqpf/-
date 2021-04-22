package homework0324;

//1~100까지의 합을 출력하되 각 10개씩의 값의 합을 중간~중간에 출력하시오.
//1~10 / 11~20 / 21~30 / 31~40 / 41~50 / 51~60 / 61~70 / 71~80 / 81~90 / 91~100
public class Test2 {
	public static void main(String[] args) {
		int sum = 0, count=0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			count += 1;
			if(i%10 == 0) System.out.println((count-9)+"~"+count+"까지의 합은" +sum+ "입니다.");
		}
		System.out.println("1~100까지의 합은" + sum + "입니다");
	}
}
