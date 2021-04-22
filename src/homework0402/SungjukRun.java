package homework0402;

public class SungjukRun {
	public static void main(String[] args) {
		Sungjuk sung = new Sungjuk("홍길동",90,80,70);
	
		sung.display();
		
		sung.hap1();
		
		int result = sung.hap2(70, 70, 70);
		System.out.println("3번문제");
		System.out.println("총 점수는 "+result+"이랍니다~");
		System.out.println();
	
		int avg = sung.avg(result);
		System.out.println("4번문제");
		System.out.println("평균은 "+avg+"입니다.");
		System.out.println();
		
		String grade = sung.grade(avg);
		System.out.println("5번문제");
		System.out.println("학점은 "+grade+"입니다.");
		System.out.println();
	}
}
