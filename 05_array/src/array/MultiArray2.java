package array;

public class MultiArray2 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int num = 1;
		
//		for(int i = 0; i<ar.length; i++) {//青
//			for(int j=0; j<ar[i].length; j++) {
//				ar[i][j] = num;
//				num++;
//			}
//		}
//		
		
//		for(int i = 0; i<ar.length; i++) {//青
//			for(int j=0; j<ar[i].length; j++) {
//				ar[i][j] = num;
//				num= num+10;
//			} num = num - 99;
//		}
		
//		for(int i = 0; i<ar.length; i++) {//青
//		for(int j=0; j<ar[i].length; j++) {
//			ar[j][i] = num;
//			num++;
//		}
//	}
		
		for(int i = ar.length-1; i>=0; i--) {//青
		for(int j=ar[i].length-1; j>=0; j--) {
			ar[j][i] = num;
			num++;
		}
	}
		
		
		for(int i = 0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				//System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]);
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
		
	}
}
