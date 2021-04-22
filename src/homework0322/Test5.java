package homework0322;

//1~30까지 1씩 증가하면서 수행하되, 
//3의 배수에서는 박수 한번(짝), 
//5의 배수에서는 박수 두번(짝짝), 
//7의 배수에서는 박수 세번(짝짝짝)이라는 메세지를 출력하시오.  
//- 3/5/7의 배수가 맞는지 변수값도 출력
public class Test5 {
	public static void main(String[] args) {
		
		for(int i=1; i<=30; i++) {
			System.out.print("현재 숫자는 "+i);
			if(i%3 == 0) 		System.out.print("\t(짝)");
			else if(i%5 == 0) System.out.print("\t(짝짝)");
			else if(i%7 == 0) System.out.print("\t(짝짝짝)");
			System.out.println();
		}
	}
}
