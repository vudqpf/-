package homework0409_1;

import java.util.Scanner;

public class Purity implements Washer{
	Scanner sc = new Scanner(System.in);
	int time = 0;
	int money = 0;
	
	@Override
	public void name(int num) {
		time = 0;
		money = 0;
		System.out.println((num+1)+"번 "+NAME[num]);
		
	}

	@Override
	public void washing() {
		System.out.println("세탁기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;
		money += (150*num);	
	}

	@Override
	public void rinsing() {
		System.out.println("헹굼기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;
		money += (300*num);
	}

	@Override
	public void dehydration() {
		System.out.println("탈수기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;
		money += (200*num);
	}
	@Override
	public void dry() {
		System.out.println("건조기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;
		money += (300*num);
	}
	@Override
	public void ironing() {}

	@Override
	public void price() {
		System.out.println("총 시간 : "+time+"분");
		System.out.println("총 금액 : "+money+"원");
		
	}

}
