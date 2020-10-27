import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableShapes {
	public static abstract class Shape implements Comparable<Shape> {
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

		@Override
		public int compareTo(Shape s) {
			/*
			 * compare value = 0: two objects are equal. compare value > 0: the first object
			 * (the current object) is greater than the second one. compare value < 0: the
			 * first object is less than the second one.
			 */

			return (int) (this.getArea() - s.getArea());
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

	}

	public static void main(String[] args) {
		List<Shape> myList = new ArrayList<>();
		myList.add(new Square(5));
		myList.add(new Square(10));
		myList.add(new Triangle(10, 10));
		for (Shape myShape : myList) {
			System.out.println(myShape.toString());
		}
		System.out.println("---------");
		Collections.sort(myList);
		for (Shape myShape : myList) {
			System.out.println(myShape.toString());
		}
	}
}
