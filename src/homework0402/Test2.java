package homework0402;

public class Test2 {
	public static void main(String[] args) {
		String[] game = {"짝","짝짝","짝짝짝"};
		
		for(int i = 1; i <= 100; i++) {
			int num1 = i/10;
			int num2 = i%10;
			System.out.print(i);
			for(int j=3; j<10; j+=3) {
				if(num1==j) System.out.print(game[(j-3)/3]);
				else if(num2==j) System.out.print(game[(j-3)/3]);
			}
			System.out.println();
	    }
	}
}
