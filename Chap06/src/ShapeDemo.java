class Shape {
    void draw() {
        System.out.println("Drawing Something");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeDrawer {
    // Use polymorphism to take a Shape (Parent, Ancestor) type as a parameter
    public void drawShape(Shape shape) {
        shape.draw(); // At runtime, appropriate class' draw method is called
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();

        Shape myShape = new Shape();
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        // Using polymorphism for method parameter
        shapeDrawer.drawShape(myShape);  // Output: Drawing Something
        shapeDrawer.drawShape(myCircle); // Output: Drawing a Circle
        shapeDrawer.drawShape(myRectangle); // Output: Drawing a Rectangle
    }
}

