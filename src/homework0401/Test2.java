package homework0401;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇가지 숫자를 비교하시겠습니까?");
	      int k = scan.nextInt();
	      int[] arr = new int [k];
	      int n =-1;
	      int count = 0;
	      int sw =0;

	      do{
	         n++;
	         System.out.println("숫자를 입력해주세요? ");
	         arr[n] = scan.nextInt();
	      }while(n<k-1);

	      int temp = 0;

	      for(int i =1; i <=k-1; i++){
	      sw=0;
	         for(int j = 0; j<=(k-2); j++){
	            if(arr[j] > arr[j + 1]){
	               temp =arr[j];
	               arr[j]= arr[j + 1];
	               arr[j + 1] = temp;
	               count++;
	               sw = 1;
	         }
	      }
	         if(sw==0)break;
	      }
	      for(int i = 0; i<k; i++){
	         System.out.print(arr[i] +"");
	         }
	}
}
