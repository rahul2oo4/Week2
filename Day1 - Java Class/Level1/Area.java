class Circle{
   int radius;
   public Circle(int radius) {
   	this.radius = radius;
   }
   public double getArea() {
   	return Math.PI * radius * radius;
   }
}
public class Area {

public static void main(String[] args) {
Circle circle = new Circle(5);
System.out.println(circle.getArea());
}
}

