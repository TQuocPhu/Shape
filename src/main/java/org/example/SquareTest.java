package org.example;
import shape.*;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", false, 2.63);
        System.out.println(square);
    }
}
