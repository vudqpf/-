package homework0324;

// -(1/2) + (2/3) - (3/4) + (4/5) - (5/6) + (6/7) - (7/8) + (8/9) - (9/10)  의 결과를 구하는 프로그램을 작성하시오.
public class Test6 {
	public static void main(String[] args) {
	double number = 0;
	double i=0;
	
	for(i=1; i<10; i++) {
		if(i%2 == 0)	number += (i/(i+1));
		else			number -= (i/(i+1));
	}
	System.out.println("-(1/2) + (2/3) + ······+(9/10) 계산 결과는" +number);
		
	}
}
