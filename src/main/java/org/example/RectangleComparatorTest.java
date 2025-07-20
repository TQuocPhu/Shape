package org.example;

import shape.Rectangle;
import shape.RectangleComparator;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(26,3);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle("pink", false, 7,2);

        System.out.println("Truoc khi sap xep: ");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("Sau khi sap xep: ");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
