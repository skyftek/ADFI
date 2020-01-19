package SS07.Exercise1.Entity;

import SS07.Exercise1.Interface.IContent;
import SS07.Exercise1.Interface.IShape;

public class Triangle implements IShape, IContent {
    private float a;
    private float b;
    private float c;

    @Override
    public void description() {
        System.out.println("Chu vi tam giac co 3 canh a = " + this.a + ", b = " + this.b + ", c = " + this.c + " la: " + this.perimeter());
        System.out.println("Dien tich tam giac co 3 canh a = " + this.a + ", b = " + this.b + ", c = " + this.c + " la: " + this.acreage());
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double acreage() {
        double p = this.perimeter() / 2;
        double s = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return s;
    }

    public Triangle() {
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public boolean checkExist() {
        if ((a + b) > c) {
            return true;
        } else if ((a + c) > b) {
            return true;
        } else if ((b + c) > a) {
            return true;
        } else {
            return false;
        }
    }
}
