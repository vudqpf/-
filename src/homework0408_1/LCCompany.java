package homework0408_1;

public class LCCompany implements Washing {
	@Override
	public void name() {
		System.out.println("LC세탁기");
	}
	
	@Override
	public void basicFunction() {
		System.out.println("기본기능(빨래, 행굼, 탈수) 기능 가능");
	}

	@Override
	public void callimFuntion() {
		System.out.println("불림 기능 가능");
	}

	@Override
	public void boilFunction() {
		System.out.println("삶기 기능 가능");
	}

	@Override
	public void dryFunction() {}

	@Override
	public void runningTime(int time) {
		System.out.println(time+"시간");
	}

}
