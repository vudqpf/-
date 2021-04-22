package homework0402;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 boolean game = true;
		 String[] rule = {"가위","바위","보"};
		 int count=0;
	     
	     while(game) {
	        int computer = (int)(Math.random()*3)+1;
	        System.out.print("가위, 바위, 보,  종료:그만");
	        String user = sc.next();
	        
	        if(user.equals("가위")) {
	        	if(computer==0) System.out.println("컴퓨터는 "+rule[computer]+"!! 비겼습니다.");
	        	else if(computer==1) System.out.println("컴퓨터는 "+rule[computer]+"!! 졌습니다.");
	        	else if(computer==2) {
	        		System.out.println("컴퓨터는 "+rule[computer]+"!! 이겼습니다.");
	        		count++;
		        	game = false;
	        	}
	        }else if(user.equals("바위")) {
	        	if(computer==1) System.out.println("컴퓨터는 "+rule[computer]+"!! 비겼습니다.");
	        	else if(computer==2) System.out.println("컴퓨터는 "+rule[computer]+"!! 졌습니다.");
	        	else if(computer==0) {
	        		System.out.println("컴퓨터는 "+rule[computer]+"!!이겼습니다.");
	        		count++;
		        	game = false;
	        	}
	        }else if(user.equals("보")) {
	        	if(computer==2) System.out.println("컴퓨터는 "+rule[computer]+"!! 비겼습니다.");
	        	else if(computer==0) System.out.println("컴퓨터는 "+rule[computer]+"!! 졌습니다.");
	        	else if(computer==1) {
	        		System.out.println("컴퓨터는 "+rule[computer]+"!!이겼습니다.");
	        		count++;
		        	game = false;
	        	}
	        }else if(user.equals("그만")) {
	        	game = false;
	        }
	        
	       
	     }
	     System.out.println(count+"회 실행했습니다.");
	     System.out.println("시스템 종료");
	     sc.close();
	}
}

