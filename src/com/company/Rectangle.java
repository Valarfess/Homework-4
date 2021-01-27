package com.company;

public class Rectangle{
    public double x,y;

    //конструктор 1
    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    //конструктор 2
    public Rectangle(double x){
        this.x = x;
        this.y = x;
    }

    //расчет площади
    public double calculateArea(){
        double calculateArea = x*y;
        return calculateArea;

    }

    //вывод площади в консоль
    public void printArea(){
        System.out.println("Площадь прямоугольник - " + calculateArea());
    }

//    //вывод в консоль типа прямоугольник/квадрат
    public void printRectangleKind(){
        if (x==y)
            System.out.println("Это квадрат");
        else
            System.out.println("Это прямоугольник");
    }

    //вывод в консоль
//    public boolean isTheSameRectangle(){
//
//    }

}
