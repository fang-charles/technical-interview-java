import java.util.ArrayList;
import java.util.List;

public class AbstractShapes {
	public static abstract class Shape {
		int n, area;

		void printNumSides() {
			System.out.println(n);
		}

		abstract double getArea();

		@Override
		public String toString() {
			return this.getClass().getName() + ": n = " + Integer.toString(n) + ", area = "
					+ Double.toString(getArea());
		}
	}

	public static class Square extends Shape {
		int length;

		Square(int length) {
			this.n = 4;
			this.length = length;
		}

		@Override
		double getArea() {
			return length * length;
		}

	}

	public static class Triangle extends Shape {
		int base;
		int height;

		Triangle(int base, int height) {
			this.base = base;
			this.height = height;
			this.n = 3;

		}

		@Override
		double getArea() {
			return (0.5) * base * height;
		}

		void doStuff() {
			if (base > 10) {
				System.out.println("The base is too large");
			}
		}
	}

	public static void main(String[] args) {
		List<Shape> myList = new ArrayList<>();
		myList.add(new Square(5));
		myList.add(new Square(10));
		myList.add(new Triangle(10, 10));
		for (Shape myShape : myList) {
			System.out.println(myShape.toString());
		}
	}

}
