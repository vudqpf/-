package homework0407;

import javax.swing.text.Position.Bias;

public class Woojubunsik extends Bonsa{

	@Override
	void price() {
		setKimchi(6000);
		setBudae(7000);
		setBibim(7000);
		setSundae(6000);
		setRice(1000);
		
	}

	@Override
	void local() {
		System.out.println("증권가에 매장3호점");
		System.out.print("메뉴(번호)를 고르세요? 1:김치찌개 2:부대찌개 3:비빔밥 4:순대국 5:공기밥");
		
	}

	@Override
	void menu(int num) {
		if(num == 1) System.out.println("김치찌개 : "+getKimchi()+"원");
		else if(num == 2) System.out.println("부대찌개 : "+getBudae()+"원");
		else if(num == 3) System.out.println("비빔밥 : "+getBibim()+"원");
		else if(num == 4) System.out.println("순대국 : "+getSundae()+"원");
		else if(num == 5) System.out.println("공기밥 : "+getRice()+"원");
	}

}
