public class TexturedRectangleDemo {
    public static void main(String[] args) {
        TexturedRectangle rectangle = new TexturedRectangle(5, 10, "Red", "Smooth");

        System.out.println("Area: " + rectangle.calculateArea());       // Area: 50.0
        System.out.println("Color: " + rectangle.getColor());           // Color: Red
        System.out.println("Texture: " + rectangle.getTexture());       // Texture: Smooth
    }
}
