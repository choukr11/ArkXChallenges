package Day7.GeometricShapesWithDrawables;

import java.util.Scanner;

public class Circle extends Shape {
    Scanner sc = new Scanner(System.in);
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color) {
        super(color);

    }

    @Override
    public double calculateArea(){
        System.out.print("Enter a Radius (cm): ");
        radius =sc.nextDouble();
        return Math.PI*radius*radius;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Circle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Circle");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Circle");
    }
}


