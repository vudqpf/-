package homework0408_1;

public class DajinCompany implements Washing {
	@Override
	public void name() {
		System.out.println("대진세탁기");
	}
	
	@Override
	public void basicFunction() {
		System.out.println("기본기능(빨래, 행굼, 탈수) 기능 가능");
	}

	@Override
	public void callimFuntion() {}

	@Override
	public void boilFunction() {
		System.out.println("삶기 기능 가능");
	}

	@Override
	public void dryFunction() {
		System.out.println("건조 기능 가능");
	}

	@Override
	public void runningTime(int time) {
		System.out.println(time+"시간");
	}

}
