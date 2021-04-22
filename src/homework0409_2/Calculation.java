package homework0409_2;


public class Calculation {
	Vo vo = new Vo();
	
	//더하기
	public void plus(Vo vo) {
		System.out.println("1결과 : "+(vo.getNum1()+vo.getNum2()));
	}
	
	//빼기
	public void minus(Vo vo) {
		System.out.println("2결과 : "+(vo.getNum1()-vo.getNum2()));
	}
	
	//곱하기
	public void multiply(Vo vo) {
		System.out.println("3결과 : "+(vo.getNum1()*vo.getNum2()));
	}
	
	//나누기
	public void divide(Vo vo) {
		System.out.println("4결과 : "+(vo.getNum1()/vo.getNum2()));
	}
}
