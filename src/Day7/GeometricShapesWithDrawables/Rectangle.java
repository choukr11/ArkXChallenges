package Day7.GeometricShapesWithDrawables;

import java.util.Scanner;

class Rectangle extends  Shape{
    Scanner sc = new Scanner(System.in);

    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    public Rectangle(String color) {
        super(color);
    }
    public double calculateArea(){
        System.out.print("Enter a Length (cm): ");
        length =sc.nextDouble();
        System.out.print("Enter a Width (cm): ");
        width =sc.nextDouble();
        return length*width;
    }
    @Override
    public void displayShapeType() {
        System.out.println("This is a Rectangle!");
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing a Rectangle");
    }
    @Override
    public void displayShape() {
        System.out.println("Displaying Rectangle");

    }
}