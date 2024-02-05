package Day7.GeometricShapesWithDrawables;
public class Main {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();

        Circle circle = new Circle("Red");
        Rectangle rectangle = new Rectangle("Blue");
        Triangle triangle = new Triangle("Yellow");
        Square square = new Square("Crimson");


        circle.displayColor();
        circle.displayShapeType();
        System.out.println("Circle Area: " +circle.calculateArea());
        circle.drawShape();

        rectangle.displayColor();
        rectangle.displayShapeType();
        System.out.println("Rectangle Area: "+rectangle.calculateArea());
        rectangle.drawShape();

        triangle.displayColor();
        triangle.displayShapeType();
        System.out.println("Triangle Area: "+triangle.calculateArea());
        triangle.drawShape();

        square.displayColor();
        square.displayShapeType();
        System.out.println("Square Area: "+square.calculateArea());
        square.drawShape();

        drawingBoard.listDrawables();
        drawingBoard.displayShapeType();
        drawingBoard.displayShape();
        drawingBoard.listDrawables();
    }
}