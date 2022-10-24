package sukkiri;

public class practice5_4 {
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2.0;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		double triangleArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		double circleArea = calcCircleArea(radius);
		System.out.println("円の面積：" + circleArea + "平方cm");		
	}
}
