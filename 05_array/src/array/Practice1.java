package array;

public class Practice1 {

	public static void main(String[] args) {

		int[] ar; // char[] ar; 悼老
		ar = new int[50]; // ar = new char[50]; 悼老
		int[] count = new int[26]; //规过 1
//		int sw = 0; //规过 2

		for (int i = 0; i < ar.length; i++) {

			ar[i] = (int)(Math.random() * 26 + 65);
			System.out.print((char) ar[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		for (int i = 0; i<ar.length; i++) {
			for(int j=0; j<count.length; j++) {
				if(ar[i]==j+'A') count[j]++;
			}
		}
		
		System.out.println();
		for(int i = 0; i<count.length; i++) {
			System.out.println((char)(i+'A')+"\t"+count[i]);
		}

		
//		for (int i = 65; i <= 90; i++) {
//			for (int j = 0; j < ar.length; j++) {
//				if (i == ar[j]) {
//					sw++;
//				}
//			}
//			System.out.println((char) i + " : " + sw);
//			sw = 0;
//		}
	}
}
