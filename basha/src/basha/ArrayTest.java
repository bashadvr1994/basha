package basha;

public class ArrayTest {
	public static void main(String[] args) {
		double[] arrayVar= {1.2,3.2,2.5,4.5};
		for(int i=0;i<arrayVar.length;i++) {
			System.out.println(arrayVar[i] + " ");
			
		}
		double total=0;
		for(int i=0;i<arrayVar.length;i++) {
			total+=arrayVar[i];
		}
		System.out.println("total is "+ total);
		double max=arrayVar[0];
		for(int i=0;i<arrayVar.length;i++) {
			if(arrayVar[i] > max) max=arrayVar[i];
			
		}
		System.out.println("Max value is "+ max);
	}

}
