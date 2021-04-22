package homework0401;

import java.util.Random;

//45개의 정수형 배열방을 준비후,
//로또 생성프로그램으로 생성(중복 불허)된 6자리 로또 숫자를 각각의 방에 발생된 횟수를 누적시킨다.
//이와 같은 작업을 100회 수행시켜 각각의 로또 숫자 45개 자신 번호 방에 발생횟수를 누적 저장시킨후,
//누적된 최고 횟수의 번호 6개를 다시 꺼내어서 '오름차순 정렬'후
//금주의 로또 번호로 선정하여 발표하는 프로그램을 작성하시오.
public class Test5 {
	public static void main(String[] args) {
		//      Random rd = new Random();
		      
		      int[] lotto = new int[6];
		      int[] count = new int[45];
		      int[] print = new int[6];
		      int set = 0;
		      int num = 0;
		      
		      for(int i = 0; i<100; i++) {
		         for(int k = 0; k < 6; k++) {
		            if(k==0) {
		               lotto[k] = (int)(Math.random()*45)+1;
		               count[lotto[k]-1]++;
		            }else {
			           lotto[k] = (int)(Math.random()*45)+1;
		               for(int j = 0; j < k; j++) {
		                  if(lotto[j] == lotto[k]) {
		                     k--;
		                  }else {
		                     count[lotto[k] - 1]++;
		                  }
		               }
		            }
		         }//로또번호 생성 끝   
		      }//100회 반복 끝
		      


	}
}
