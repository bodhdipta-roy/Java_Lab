package lab_4;

class Box extends Plate {
    float height;

    public Box(float length, float width, float height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor executed. Dimensions: " + length + "x" + width + "x" + height);
    }
}
