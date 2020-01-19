package SS07.Exercise1.Entity;

import SS07.Exercise1.Interface.IContent;
import SS07.Exercise1.Interface.IShape;

public class Rectangle implements IShape, IContent {
    private float a;
    private float b;

    @Override
    public void description() {
        System.out.println("Chu vi hinh chu nhat co chieu rong a = " + this.a + ", chieu dai b = " + this.b + " la: " + this.perimeter());
        System.out.println("Dien tich hinh chu nhat co chieu rong a = " + this.a + ", chieu dai b = " + this.b + " la: " + this.acreage());
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double acreage() {
        return a * b;
    }

    public Rectangle() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
}
