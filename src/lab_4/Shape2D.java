package lab_4;
class Shape2D {
    float length;
    float width;

    public Shape2D(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float calculateArea() {
        return length * width;
    }

    public float calculateCost() {
        return calculateArea() * 40; // Rs 40 per square ft
    }
}
