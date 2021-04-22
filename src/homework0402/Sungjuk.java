package homework0402;

public class Sungjuk {
	String name;
	int kor, eng, mat;
	Sungjuk(String name, int kor, int eng, int mat){	//생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void display() {
		System.out.println("1번문제");
		System.out.println("이름 : "+name+", "+"국어 : "+kor+", "+"영어 점수는"+eng+", ");
		System.out.println("수학 점수는"+mat+"입니다.");
		System.out.println();
	}
	
	void hap1() {
		int sum = kor+eng+mat;
		System.out.println("2번문제");
		System.out.println("이름은 "+name+"입니다.^^");
		System.out.println("총점은 "+sum+"입니다.^^");	
		System.out.println();
	}
	
	int hap2(int kor, int eng, int mat) {
		int result = kor+eng+mat;
		return result;
	}
	
	int avg(int sum) {
		int avg = sum/3;
		return avg;
	}
	
	String grade(int avg) {
		String grade="";
		if(avg >= 90)  grade="A";
		else if(avg >= 80)  grade="B";
		else if(avg >= 80)  grade="C";
		else  grade="D";
		return grade;
	}
}
