package homework0322;

//1~50까지 1씩 증가하면서 수행하되, 7의 배수가 될때만 '메세지'를 출력하세요. - 7의 배수가 맞는지이 맞는지 변수값도 출력
public class Test4 {
	public static void main(String[] args) {
		
		String me = "메세지";
		for(int i=1; i<=50; i++) {
			System.out.print("현재 숫자는 "+i+"입니다.");
			if(i%7 == 0) {
				System.out.print("\t" + me);
			}
			System.out.println();
		}
	}
}
