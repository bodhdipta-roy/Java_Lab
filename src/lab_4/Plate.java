package lab_4;

import java.util.Scanner;

class Plate {
    float length;
    float width;

    public Plate(float length, float width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor executed. Dimensions: " + length + "x" + width);
    }
}

