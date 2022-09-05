package chap5;

public class ArrEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20}, {30,40},{50,60}};
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		
		}
		System.out.println("개선된 for문으롷 출력");
		
		for(int[] ar1:arr) {
			for(int a:ar1) {
				System.out.println(a);
			}
		}
	}

}
