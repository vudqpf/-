package homework0326;

//방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력
public class Test1 {
	public static void main(String[] args) {
	      for(int x = 0; x <=10; x++) {
	         for(int y = 0; y <=10; y++) {   
	            
	            int result = 4*x + 5*y;
	            if(result == 60) {
	               System.out.println("( "+ x +", "+ y +" )");
	            }            
	            
	         }
	      }
	}

}
