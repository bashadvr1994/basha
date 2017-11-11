package basha;

public class Shepherd {
	int shepage;
	public Shepherd(String name) {
		System.out.println("Shepherd name is: "+name);
	}
	public void SetAge(int Age) {
		shepage=Age;
	}
	public int getAge() {
		System.out.println("Shepherd age is: "+shepage);
		return shepage;
	}
	public static void main(String[] args) {
		Shepherd myShepherd=new Shepherd("basha");
		myShepherd.SetAge(23);
		myShepherd.getAge();
		System.out.println("value is: "+myShepherd.shepage);	
	}
	
	

}
