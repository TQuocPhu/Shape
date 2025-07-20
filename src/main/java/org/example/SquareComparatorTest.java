package org.example;

import shape.Square;
import shape.SquareComparator;

import java.util.Arrays;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(26);
        squares[1] = new Square();
        squares[2] = new Square("yellow", true, 24);

        System.out.println("Truoc khi sap xep: ");
        for(Square square : squares){
            System.out.println(square);
        }

        SquareComparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("Sau khi sap xep: ");
        for(Square square : squares){
            System.out.println(square);
        }
    }
}
