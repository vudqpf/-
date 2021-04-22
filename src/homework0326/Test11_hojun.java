package homework0326;

import java.util.Scanner;

public class Test11_hojun {
	   public static void main(String[] args) {
	      Example example = new Example();
	      example.ex7();
	   }

	}

	 class Example {
	   public void  ex1(){
	      System.out.println("1번 정답");
	      for(int x = 0; x < 11; x++) {
	         for(int y = 0; y < 11; y++) {   
	            
	            int result = 4*x + 5*y;
	            
	            if(result == 60) {
	               System.out.println("( "+ x +", "+ y +" )");
	            }            
	            
	         }
	      }
	   }
	   
	   public void ex2() {
	      System.out.println("2번 정답");
	      for(int i = 1; i < 6; i++) {
	         for(int k = 0; k < i; k++) {
	            System.out.print("*");
	         }
	         System.out.println("");
	      }
	   }
	   

	   public void ex3() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("홀수만 입력해주세요");
	      int num = sc.nextInt(); 
	       
	        int half = num / 2; 

	        for (int i = -half; i <= half; i++) { 
	            int k = 0; 
	            for (int j = 0; j < num - Math.abs(i); j++) { 
	                String result = k < Math.abs(i) ? " " : "*"; 
	                System.out.print(result);
	                k++; 
	            }
	            System.out.println();
	        }
	   }

	   
	   public void ex4() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("홀수만 입력해주세요");
	      int num = sc.nextInt(); 
	        int half = num / 2;
	        System.out.println(half);
	      for(int i=0, n=0; i <=num-1;i++) {
	            for(int j=0; j <= n+(half-n)*2+1; j++) {
	                  System.out.print((j<=n)? " " : "*");
	            }
	            System.out.println();
	            if (i<half) {n++;} else { n--;}
	      }
	   }
	   
	   public void ex5() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("숫자를 입력해주세요");
	      int num = sc.nextInt();
	      if(num == 0) {
	         return;
	      }else {
	         for(int i = 0; i < 10; i++) {
	            System.out.print((i==9)?num*(i+1) : num*(i+1)+",");
	         }
	      }
	   }

	   public void ex6() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("숫자를 입력해주세요");
	      int num = sc.nextInt();
	      int result = 1;
	      for(int i = 0, k = num; i < num; i++) {
	         System.out.print((i < num-1)?k+" * " : k);
	         result = result * k;
	         k--;
	      }
	      System.out.println(" = "+result);
	   }
	   
	//여기서
	   public void ex7() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("숫자를 입력해주세요");
	      int num = sc.nextInt();
	      
	      for(int i = 0; i <= num; i++) {
	         dec(i);
	      }
	      
	   }
	   
	   public static void dec(int num){
	      if(num < 2) {
	         return;
	      }
	      
	      if(num == 2) {
	         System.out.println(num);
	         return;
	      }
	      
	      for(int i = 2; i < num; i++) {
	         if(num % i == 0) {
	            return;
	         }
	      }
	      
	      System.out.println(num);
	      return;
	   }
	   //여기까지

	   public void ex8() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("시작단를 입력해주세요");
	      int num1 = sc.nextInt();
	      System.out.println("끝단를 입력해주세요");
	      int num2 = sc.nextInt();
	      
	      for(int i = num1; i <= num2; i++ ) {
	         for(int k = 1; k < 10; k++) {
	            System.out.println(i+" * "+k+" = "+i*k);
	         }
	      }
	   
	   }
	}
