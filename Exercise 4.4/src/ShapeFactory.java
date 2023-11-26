public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType){
        return switch (shapeType) {
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            default -> null;
        };
    }
}
