/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.InterfaceExample;

import java.util.ArrayList;

/**
 *
 * @author skyftek
 */
public class ShapeManagement {

    private static final ArrayList<IShape> list = new ArrayList();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(7);
        ShapeManagement.list.add(circle);
        for (IShape is : list) {
            System.out.println("Chu vi: " + is.perimeter());
            System.out.println("Dien tich: " + is.acreage());
        }
    }
}
