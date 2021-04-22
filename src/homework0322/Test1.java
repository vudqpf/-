package homework0322;

//1~100까지의 짝수합을 구하세요
public class Test1 {
	public static void main(String[] args) {
			
		int num=0, i=0;
		while(i < 100) {
			i++;
			if((i%2) == 0) num += i;
		}
		System.out.println("1~100까지의 짝수의 합은 "+num+"이다");
	}
}
