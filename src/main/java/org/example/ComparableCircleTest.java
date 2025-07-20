package org.example;

import shape.Circle;
import shape.ComparableCircle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red", false, 4.0);

        System.out.println("Truoc khi sap xep: ");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("Sau khi sap xep: ");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
