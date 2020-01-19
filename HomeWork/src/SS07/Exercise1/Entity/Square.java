package SS07.Exercise1.Entity;

import SS07.Exercise1.Interface.IContent;
import SS07.Exercise1.Interface.IShape;

public class Square implements IShape, IContent {
    private float a;

    @Override
    public void description() {
        System.out.println("Chu vi hinh vuong co canh a = " + this.a + " la: " + this.perimeter());
        System.out.println("Dien tich hinh vuong co canh a = " + this.a + " la: " + this.acreage());
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public double acreage() {
        return a * a;
    }

    public Square() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public Square(float a) {
        this.a = a;
    }
}
