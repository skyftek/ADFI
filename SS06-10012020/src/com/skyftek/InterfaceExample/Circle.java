/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.InterfaceExample;

/**
 *
 * @author Skyftek
 */
public class Circle implements IShape {

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

    public Circle() {
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

}
