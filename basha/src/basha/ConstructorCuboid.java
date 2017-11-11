package basha;

public class ConstructorCuboid {
	int length;
	int breadth;
	int height;
	public int getVolume() {
		return(length*breadth*height);
	}
	ConstructorCuboid(){
		length=10;
		breadth=10;
		height=10;
	}
	ConstructorCuboid(int l, int b, int h) {
		length=l;
		breadth=b;
		height=h;
	}
	public static void main(String[] args) {
		ConstructorCuboid CubeObj1, CubeObj2;
		CubeObj1= new ConstructorCuboid();
		CubeObj2 = new ConstructorCuboid(5,5,5);
		System.out.println("volume of couboid is "+CubeObj1.getVolume());
		System.out.println("volume of couboid is "+CubeObj2.getVolume());
	}

}
