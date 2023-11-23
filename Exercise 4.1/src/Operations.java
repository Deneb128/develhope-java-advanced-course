public enum Operations {

    ADD("add"),
    MULTIPLY("multiply"),
    SUBTRACT("subtract"),
    DIVIDE("divide"),
    MIN("min"),
    MAX("max");

    private String type;

    private Operations(String a) {
        this.type = a;
    }

    public static Boolean IsOpValid(String op)
    {
        switch(op.toLowerCase())
        {
            case "add":
            case "multiply":
            case "subtract":
            case "divide":
            case "min":
            case "max":
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