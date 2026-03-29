public class Main


{
	public static void main(String[] args) {

		double x1 = 25;
		double x2 = 35;
		double y1 = 25.5;
		double y2 = 35.5;
		double d = 0;
		double r = 6371.01;

		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);

		d = r * Math.acos((Math.sin(x1) * Math.sin(x2)) + Math.cos(x1) * (Math.cos(x2) * Math.cos(y1 - y2)));

		System.out.println(d);


	}
}