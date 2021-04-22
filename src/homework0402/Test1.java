package homework0402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] dictionary = {{"Love", "사랑"},{"java", "자바"},{"raise", "올리다"},{"commit", "약속하다."},{"lead","읽다."},{"like","좋아하다"}};
		
		while(true) {
			System.out.println("0:영한  1:한영  2:종료");
			int select = sc.nextInt();
			if(select==2)	break;
			
			System.out.print("찾을 단어를 입력하세요");
			String word = sc.next();
			if(select == 0) {
				for(int i=0; i<dictionary.length; i++) {
					if(word.equals(dictionary[i][select])) System.out.println(dictionary[i][1]);
				}
			}else if(select == 1) {
				for(int i=0; i<dictionary.length; i++) {
					if(word.equals(dictionary[i][select])) System.out.println(dictionary[i][0]);
				}
			}

		}
	System.out.println("시스템 종료");
	sc.close();
	}

}
