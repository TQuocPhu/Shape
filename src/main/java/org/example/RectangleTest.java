package org.example;

import shape.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", false, 26, 3);
        System.out.println(rectangle);
    }
}
