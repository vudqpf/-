package homework0329;

//달팽이가 나무를 올라가는데 낮에는 5cm를 올라가고, 밤에는 3.5cm를 내려온다고 할때, 
//이 달팽이가 전체길이 20Cm의 나무 정상에 올라가려면 몇일이 걸리는지 프로그램으로 작성하시오?
public class Test8 {
	public static void main(String[] args) {
		boolean sw= true;
		double sum=0;
		int count=0;
		
		while(sw) {
			sum += 5;
			sum -= 3.5;
			count++;
			if(sum>20) sw=false;
		}
	System.out.println("달팽이가 20cm를 올라가기 위해선 "+count+"일이 필요합니다.");
		
		
	}
}
