package lab_4;

class WoodBox extends Box {
    float thickness;

    public WoodBox(float length, float width, float height, float thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor executed. Dimensions: " + length + "x" + width + "x" + height + ", thickness: " + thickness);
    }
}
