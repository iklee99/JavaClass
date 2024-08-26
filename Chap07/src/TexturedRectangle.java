class TexturedRectangle implements TexturedShape {
    private double width;
    private double height;
    private String color;
    private String texture;

    public TexturedRectangle(double width, double height, String color, String texture) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getTexture() {
        return texture;
    }
}
