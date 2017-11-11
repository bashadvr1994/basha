package basha;

public class stars {
	
	public static void main(String[] args) {
		int l=5,k=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<l;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			System.out.println();
			l--;
			k+=1;
		}

	}

}
