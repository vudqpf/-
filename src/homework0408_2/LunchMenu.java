package homework0408_2;

public abstract class LunchMenu {
	String[] menu = {"밥", "불고기", "두부조림", "미역국"};
	int[] menuprice = {500,2000,1000,1000};
	String[] dessertMenu = {"요플레", "바나나", "우유", "아몬드"};
	int[] dessertprice = {800,500,500,700};
	String[] name = {"임기쁨", "임유신", "임선덕"};
	int result=0;

	public abstract void name(int num);	
	public abstract void calculation(int de);
	public abstract void order();
	public abstract void dessertorder();
}
