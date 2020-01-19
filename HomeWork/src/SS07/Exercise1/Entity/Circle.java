package SS07.Exercise1.Entity;

import SS07.Exercise1.Interface.IContent;
import SS07.Exercise1.Interface.IShape;

public class Circle implements IShape, IContent {

    private double radius;

    @Override
    public double perimeter() {
        double perimeter = 3.14 * 2 * this.radius;
        return perimeter;
    }

    @Override
    public double acreage() {
        double acreage = 3.14 * this.radius * this.radius;
        return acreage;
    }

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void description() {
        System.out.println("Chu vi hinh tron ban kinh " + this.radius + " la: " + this.perimeter());
        System.out.println("Dien tich hinh tron ban kinh " + this.radius + " la: " + this.acreage());
    }
}
