package homework0409_1;

import java.util.Scanner;

public class Green implements Washer{
	Scanner sc = new Scanner(System.in);
	int time = 0, money = 0;
	@Override
	public void name(int num) {			//이름입력
		time = 0; money = 0;
		System.out.println((num+1)+"번 "+NAME[num]);
	}
	@Override
	public void washing() {				//세탁
		System.out.println("세탁기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;  money += (100*num);	
	}
	@Override
	public void rinsing() {				//헹굼
		System.out.println("헹굼기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;   money += (200*num);
	}
	@Override
	public void dehydration() {}		//탈수
	@Override
	public void dry() {					//건조
		System.out.println("건조기능");
		System.out.print("몇 분 하시겠습니까? ");
		int num = sc.nextInt();
		time += num;   money += (100*num);
	}
	@Override
	public void ironing() {}			//다리미
	@Override
	public void price() {				//계산
		System.out.println("총 시간 : "+time+"분");
		System.out.println("총 금액 : "+money+"원");
		
	}

}
