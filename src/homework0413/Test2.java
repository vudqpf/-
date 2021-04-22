package homework0413;

import java.util.Scanner;

public class Test2 {
	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      String[] ex = {"JPG", "GIF", "PNG", "XLSX", "ZIP"};
		      
		      while(true) {
		         System.out.println("업로드 할 파일명을 입력하세요. (종료 : 999)");
		         System.out.println("\"jpg/gif/png/xlsx/zip\" 파일만 업로드할 수 있습니다.");
		         System.out.print("> ");
		         String file = sc.next();
		         if(file.equals("999")) {
		            System.out.println("프로그램 종료");
		            break;
		         }
		         
		         String dot = file.substring(file.lastIndexOf(".")+1);
		         String dot2 = dot.toUpperCase();
		         System.out.println(dot2);
		         System.out.println(ex[1]);
		         for(int i=0; i<=ex.length; i++) {
		            if(dot2 == ex[i]) {
		               System.out.println("업로드 가능한 파일입니다.");
		               break;
		            } else {
		               System.out.println("업로드 불가능한 파일입니다. 다시 선택해 주세요.");
		               break;
		            }
		         }
		      }
		      
		      sc.close();
		   }
}
