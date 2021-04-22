package homework0329;

////아래과 같은 패턴으로 출력되는 프로그램을 만드시오?
//@****
//*@***
//**@**
//***@*
//****@
public class Test9 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=2; j<=i; j++) System.out.print("*");
			for(int j=i; j<=i; j++) System.out.print("@");
			for(int j=i+1; j<=5; j++) System.out.print("*");
			System.out.println();
		}
	}
}
