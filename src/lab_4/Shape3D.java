package lab_4;
class Shape3D extends Shape2D {
  float height;

  public Shape3D(float length, float width, float height) {
    super(length, width);
    this.height = height;
  }

  public float calculateArea() {
    return super.calculateArea() * height;
  }

  public float calculateCost() {
    return calculateArea() * 60; // Rs 60 per cubic ft
  }
}

