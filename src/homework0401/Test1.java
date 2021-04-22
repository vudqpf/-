package homework0401;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이 몇명입니까? ");
		int num = sc.nextInt();
		int[] name = new int[num];
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] mat = new int[num];
		int[] tot = new int[num];
		double[] avg = new double[num];
		String[] rank = new String[num];
		int[] level = new int[num];
		
		
		for(int i=0; i<name.length; i++) {
			System.out.print("학번 : ");
			name[i] = sc.nextInt();
			System.out.print("국어 점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+mat[i];		//총점
			avg[i] = tot[i]/3;					//평균
			if(avg[i]>=90) rank[i] = "A";		//랭크	
			else if(avg[i]>=80) rank[i] = "B";
			else if(avg[i]>=70) rank[i] = "C";
			else if(avg[i]>=60) rank[i] = "D";
			else if(avg[i]>=50) rank[i] = "E";
			else  rank[i] = "F";	
		}
		
		 for(int i=0; i<level.length-1; i++) {	//순위
			 level[i] = 1;
	         for(int j=1; j<level.length; j++) {
	        	 if(avg[i]<avg[j]) level[i]++;
	         }
	     }

		System.out.println("========================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t학점\t순위");
		System.out.println("-------------------------------------");
		for(int i=0; i<name.length; i++) {
		System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]+"\t"+level[i]);
		}
		System.out.println("========================================================");
		
		sc.close();
	}
}
