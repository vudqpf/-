package homework0322;

//1부터 숫자를 1씩 더하면서 그 합이 '1000'이상이 되는순간은 1부터 얼마(?)까지의 합을 더했을때 인지를 출력하세요.
public class Test9 {
	public static void main(String[] args) {
		
		int sum=0, i=0;
		while(sum < 1000) {
			i++;
			sum += i;
		}
		System.out.println("1부터 "+ i + "까지의 합은 " + sum + "이다.");
	}
}
