public enum ShapeType {
    TRIANGLE("triangle"),
    SQUARE("square");

    private String type;

    private ShapeType(String a) {
        this.type = a;
    }

    public static Boolean IsShapeValid(String shape)
    {
        switch(shape.toLowerCase())
        {
            case "triangle":
            case "square":
                return true;
            default:
                return false;
        }
    }

    @Override
    public String toString(){
        return type;
    }
}
