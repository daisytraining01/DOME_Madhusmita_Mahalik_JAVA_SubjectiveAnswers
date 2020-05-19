public class MethodOverloading implements InterfaceSample {

	public int sum(int x, int y) {
		return x + y;
	}

	public float sum(float x, float y) {
		return x + y;
	}

	public float sum(int x, float y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		int sumInt = obj.sum(99, 29);
		float sumFloat = obj.sum(8.0f, 0.1f);
		float sumIntFloat = obj.sum(23, 9.0f);
		
		System.out.println("Total of integer is: " + sumInt);
		System.out.println("Total of float is: " + sumFloat);
		System.out.println("Total of integer & float is: " + sumIntFloat);

	}

}
