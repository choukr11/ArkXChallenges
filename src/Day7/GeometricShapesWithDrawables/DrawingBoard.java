package Day7.GeometricShapesWithDrawables;
import java.util.ArrayList;
import java.util.Scanner;
public class DrawingBoard implements Drawable {
    int shape;
    String color;
    double radius;
    double length;
    double width;
    double base;
    double height;
    double side;
    ArrayList<String> drawables = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Circle circle = new Circle(color, radius);
    Rectangle rectangle = new Rectangle(color,length,width);
    Triangle triangle = new Triangle(color,base, height);
    Square square = new Square(color, side);
    public void collectionOfDrawables() {
        drawables.add("Circle");
        drawables.add("Rectangle");
        drawables.add("Triangle");
        drawables.add("Square");
    }
    public void listDrawables() {
        for (int i = 0; i < drawables.size(); i++) {
            System.out.println(drawables.get(i));
        }
    }
    public void displayShapeType() {

        System.out.println("""
                Enter shape type:\s
                1 - Circle
                2 - Rectangle
                3 - Triangle
                4 - Square""");

        shape = sc.nextInt();

        switch (shape) {
            case 1:
                circle.displayShapeType();
                break;
            case 2:
                rectangle.displayShapeType();
                break;
            case 3:
                triangle.displayShapeType();
                break;
            case 4:
                square.displayShapeType();
                break;
            default:
        }
    }
    @Override
    public void drawShape() {
        System.out.println("""
                Enter shape type:\s
                1 - Circle
                2 - Rectangle
                3 - Triangle
                4 - Square""");
        shape = sc.nextInt();

        switch(shape) {
            case 1:
                circle.drawShape();
                break;
            case 2:
                rectangle.drawShape();
                break;
            case 3:
                triangle.drawShape();
                break;
            case 4:
                square.drawShape();
                break;
            default:
        }
    }
    @Override
    public void displayShape() {
        System.out.println("""
                Enter shape type:\s
                1 - Circle
                2 - Rectangle
                3 - Triangle
                4 - Square""");
        shape = sc.nextInt();

        switch (shape) {
            case 1:
                circle.displayShape();
                break;
            case 2:
                rectangle.displayShape();
                break;
            case 3:
                triangle.displayShape();
                break;
            case 4:
                square.displayShape();
                break;
            default:
        }
    }
}