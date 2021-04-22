package homework0408_1;

public class JeilConpany implements Washing{
	@Override
	public void name() {
		System.out.println("제일세탁기");
	}

	@Override
	public void basicFunction() {
		System.out.println("기본기능(빨래, 행굼, 탈수) 기능 가능");
	}

	@Override
	public void callimFuntion() {}

	@Override
	public void boilFunction() {}

	@Override
	public void dryFunction() {}

	@Override
	public void runningTime(int time) {
		System.out.println(time+"시간");
	}


}