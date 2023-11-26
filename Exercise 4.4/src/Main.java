public class Main {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        if (square != null) {
            square.Draw();
        }
        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) {
            triangle.Draw();
        }
    }
}