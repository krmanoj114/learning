package com.test.oops.concept;

abstract class Shape {
    public abstract double getArea();
}

interface test {
	void method();
}

class Rectangle extends Shape implements test{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


   
public class AbstractionExample {
	 public static void main(String[] args) {
	        Shape rectangle = new Rectangle(5, 10);
	        Shape circle = new Circle(5);

	        System.out.println("Rectangle area: " + rectangle.getArea());
	        System.out.println("Circle area: " + circle.getArea());
	    }

}
