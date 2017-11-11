package basha;

public class ConstructorChaining {
	

		 int length;
		 int breadth;
		 int height;
		 public int getVolume() {
		  return (length * breadth * height);
		 }
		 ConstructorChaining () {
		  this(10, 10);
		  System.out.println("Finished with Default Constructor");
		 }
		 ConstructorChaining (int l, int b) {
		  this(l, b, 10);
		  System.out.println("Finished with Parameterized Constructor having 2 params");
		 }
		 ConstructorChaining (int l, int b, int h) {
		  length = l;
		  breadth = b;
		  height = h;
		  System.out.println("Finished with Parameterized Constructor having 3 params");
		 }
		 public static void main(String[] args) {
			 ConstructorChaining cubeObj1, cubeObj2;
		  cubeObj1 = new ConstructorChaining ();
		  cubeObj2 = new ConstructorChaining (10, 20, 30);
		  System.out.println("Volume of Cuboid2 1 is : " + cubeObj1.getVolume());
		  System.out.println("Volume of Cuboid2 2 is : " + cubeObj2.getVolume());
		 }
		}


