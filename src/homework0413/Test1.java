package homework0413;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"JPG", "GIF", "PNG", "XLSX", "ZIP"};
		
		while(true) {
			System.out.print("파일명을 입력하세요(예:그림.jpg) 종료:999");
			String files = sc.next();
			if(files.equals("999")) break;
			String changeFiles = files.toUpperCase();
			System.out.println("파일명 대문자 변환 : "+changeFiles);
			System.out.println(changeFiles.substring(changeFiles.lastIndexOf(".")+1));
			for(int i=0; i<arr.length; i++) {
				if(changeFiles.substring(changeFiles.lastIndexOf(".")+1).equals(arr[i])) {
					System.out.println("업로드가 가능한 파일입니다.");
					System.out.println(arr.length);
					break;
				}else if(i == arr.length-1){
					System.out.println("업로드가 불가능합니다. 다시 선택하세요~");
				}
			}
			System.out.println("-------------------------------------------------");	

		}
		System.out.println("시스템 종료");
		sc.close();
	}
}
