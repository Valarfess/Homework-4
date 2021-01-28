package com.company;

import java.util.Objects;

public class Rectangle {
    public double x, y;
    private static int createdRectanglesCount;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";


    //конструктор 1
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectanglesCount++;
    }

    //конструктор 2
    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectanglesCount++;
    }

    static void printRectanglesCount() {
        System.out.println("Всего было создано " + Rectangle.createdRectanglesCount + " прямоугольников");
    }

    public static void printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }




    //расчет площади
    public double calculateArea() {
        double calculateArea = x * y;
        return calculateArea;

    }

    //вывод площади в консоль
    public void printArea() {
        System.out.println("Площадь прямоугольник - " + calculateArea());
    }

    //    //вывод в консоль типа прямоугольник/квадрат
    public void printRectangleKind() {
        if (x == y)
            System.out.println("Это квадрат");
        else
            System.out.println("Это прямоугольник");
    }


    //вывод в консоль
    public boolean isTheSameRectangle(Rectangle rectangle) {
        if (this.x == rectangle.x && this.y == rectangle.y) return true;
        else return false;
    }



}
