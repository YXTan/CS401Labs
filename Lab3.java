public class Lab3{
	public static void main(String[] args){
		double distance = 10.0;
		int step = 0;
		while (distance != 0.0){
			System.out.println("The distance between Paris and Helen is " + distance);
			distance = distance / 2;
			step ++;
		}
		System.out.println(step);
	}
}