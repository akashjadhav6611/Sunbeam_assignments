
class Box {
    private double width;
    private double depth;
    private double height;
    private String color;

    Box()
    {
        this(0,0,0," ");
    }

    Box(double side,String color)
    {
        this(side,side,side,color);
    }
    Box(double width, double depth, double height, String color) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.color = color;
    }

    String getBoxDimensions() {
        return "Box dimensions " + this.width + " " + this.depth + " " + this.height;
    }

    double getBoxVolume() {
        return width * depth * height;
    }

    boolean isEqual(Box var2)
    {
        boolean isequal = false;

        if ((this.depth == var2.depth) && (this.height == var2.height) && (this.width == var2.width)) {
            isequal = true;
        }
        return isequal;
    }

    Box createNewBox(double w, double d, double h, String color)
    {
        Box var = new Box();

        var.depth = this.depth + d;
        var.height = this.height + h;
        var.width = this.width + w;
        var.color = color;

        return var;
    }

    String getcolor()
    {
        return this.color;
    }

}
