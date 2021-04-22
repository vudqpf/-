package homework0409_1;

public interface Washer {
	String[] NAME = {"클린 세탁기","청정 세탁기", "그린 세탁기"};

	
	void name(int num);
	void washing();
	void rinsing();
	void dehydration();
	void dry();
	void ironing();
	void price();
	
}
