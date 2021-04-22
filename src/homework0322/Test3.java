package homework0322;

//1~10까지 1씩 증가하면서 수행하는동안, 짝수항에서만 '메세지'를 출력하세요. 
//- 짝수항이 맞는지 변수값도 출력
public class Test3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i + "\t메세지");
			}
		}
	}
}
