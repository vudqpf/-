package homework0407;

public abstract class Bonsa {
	private int kimchi;
	private int budae;
	private int bibim;
	private int sundae;
	private int rice;

	int getKimchi() {
		return kimchi;
	}
	void setKimchi(int kimchi) {
		this.kimchi = kimchi;
	}
	int getBudae() {
		return budae;
	}
	void setBudae(int budae) {
		this.budae = budae;
	}
	int getBibim() {
		return bibim;
	}
	void setBibim(int bibim) {
		this.bibim = bibim;
	}
	int getSundae() {
		return sundae;
	}
	void setSundae(int sundae) {
		this.sundae = sundae;
	}
	int getRice() {
		return rice;
	}
	void setRice(int rice) {
		this.rice = rice;
	}
	
	abstract void price();
	abstract void local();
	abstract void menu(int num);
	

}
