package homework0401;

//10~30000까지의 숫자를 난수 발생시킨후, 그 값을 '돈'이라 생각하고, 각각의 단위에 맞도록 필요한 화폐의 개수를 출력하시오?
//예)  발생된 난수값이  26870원 이었다고 한다면 아래와 같이 화폐를 분류시켜 출력하시오?
//26870원 = 10000원 지폐 2장,  5000원 지폐 1개,   1000원 지폐 1개,   500원 동전 1개,   100원 동전 3개,   50원 동전 1개,   10원 동전 2개
public class Test4 {
	public static void main(String[] args) {
		int don = (int)(Math.random()*29991)+10;
		don = (int)Math.round(don*0.1)*10;	//첫번째 자리수에서 반올림
		int[] money = {10000, 5000, 1000, 500, 100, 50, 10};
		int won = 0;
		
		System.out.println("난수로 생성된 돈 : "+don);
		for(int i=0; i<money.length; i++) {
			won = don/money[i];
			don -= won*money[i];
			if(don>1000) System.out.println(money[i]+"원 지폐"+won+"개");
			else System.out.println(money[i]+"원 동전"+won+"개");
		}
	}
}
