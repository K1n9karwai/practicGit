package constructor;

public class VarArgs {
	
//	public int sum(int x, int y) {
//		return x + y;
//	}
//	
//	public int sum(int x, int y, int z) {
//		return x + y + z;
//	}
//	
//	public int sum(int x, int y, int z, int r) {
//		return x + y + z + r;
//	}
	
	public int sum(int... ar) {
		int tot=0;
		for(int i=0; i<ar.length; i++) {
			tot += ar[i];
		}
		return tot;
	}

	public static void main(String[] args) {
		
		
		
		VarArgs va = new VarArgs();
		System.out.println("гу = " + va.sum(10,20));
		System.out.println("гу = " + va.sum(10,20,30));
		System.out.println("гу = " + va.sum(10,20,30,40));
		
		
	}
}
