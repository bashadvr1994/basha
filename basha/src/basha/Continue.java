package basha;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String searchMe= "peter piper picked a" + "peck of Picked pepper";
		int max=searchMe.length();
		int numPs=0;
		for(int i=0;i<max;i++) {
			if(searchMe.charAt(i) != 'p') 
				continue;
				numPs++;
				
			}
		System.out.println("found" + numPs +"p's in searMe string");
		

	}

}
