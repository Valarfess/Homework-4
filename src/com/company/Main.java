package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(4);
        Rectangle rectangle3 = new Rectangle(2,4);

        rectangle1.printArea();
        rectangle2.printArea();
        rectangle3.printArea();
        rectangle1.printRectangleKind();
        rectangle2.printRectangleKind();
        rectangle3.printRectangleKind();

        System.out.println(rectangle1.isTheSameRectangle(rectangle2));
        System.out.println(rectangle2.isTheSameRectangle(rectangle3));
        System.out.println(rectangle3.isTheSameRectangle(rectangle1));

	// write your code here
    }
}
