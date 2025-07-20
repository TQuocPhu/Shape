package org.example;

import shape.Circle;
import shape.CircleComparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.6);
        circles[1] = new Circle();
        circles[2] = new Circle("yellow", false, 3.0);

        System.out.println("Truoc khi sap xep: ");
        for(Circle circle : circles){
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sau khi sap xep: ");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
