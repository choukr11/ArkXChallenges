package Day7.GeometricShapesWithDrawables;

import java.util.Scanner;

class Triangle extends Shape {
    Scanner sc = new Scanner(System.in);

    private double base;
    private double height;
    public Triangle(String color){
        super(color);

    }
    public Triangle(String color, double base, double height){
        super(color);
        this.base= base;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        System.out.print("Enter a Length (cm): ");
        base =sc.nextDouble();
        System.out.print("Enter a Width (cm): ");
        height =sc.nextDouble();
        return (base*height)/2;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Triangle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Triangle");

    }
}