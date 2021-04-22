package homework0331;

//로또 6개 숫자 출력(
//		   - 2번 : 6개만 출력(중복불허)
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
				continue;
			}
		}
		System.out.print("로또 숫자 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
