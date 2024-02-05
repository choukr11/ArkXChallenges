package Day7.GeometricShapesWithDrawables;

import java.util.Scanner;

class Square extends Shape {
    Scanner sc = new Scanner(System.in);
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double length) {
        this.side = length;
    }



    public Square(String color, double side){
        super(color);
        this.side=side;
    }
    public Square(String color){
        super(color);
    }
    @Override
    public double calculateArea(){
        System.out.print("Enter Side (cm): ");
        side =sc.nextDouble();
        return side*side;
    }

    @Override
    public void displayShapeType() {
        System.out.println("This is a Square!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Square");
    }

    @Override
    public void displayShape() {
        System.out.println("Displaying Square");

    }
}
