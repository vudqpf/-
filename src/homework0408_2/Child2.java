package homework0408_2;

public abstract class Child2 extends LunchMenu {
	@Override
	public void name(int num) {
		System.out.println("임유신");
	}
	@Override
	public void calculation(int de) {
		for(int i=0; i<menuprice.length; i++) {
			result += menuprice[i];
		}
		result += de;
	}

	@Override
	public void order() {
		for(int i=0; i<menu.length; i++) {
			System.out.println((i+1)+menu[i] + " : " + menuprice[i]);
		}
	}
	@Override
	public void dessertorder() {
		for(int i=0; i<menu.length; i++) {
			System.out.println((i+1)+dessertMenu[i] + " : " + dessertprice[i]);
		}
	}
	
}
