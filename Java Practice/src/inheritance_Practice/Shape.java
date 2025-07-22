package inheritance_Practice;

import java.util.Scanner;

class Circle{
    private double radius;
    public Circle() {
        radius = 0.0;
    }
    void setRadius(){
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = pp.nextDouble();
    }
    double getRadius(){
        return radius;
    }
    void Area(){
        System.out.println("Area of circle: " +  (3.14 * radius * radius));
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        height = 0.0;
    }
    void setHeight(){
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = pp.nextDouble();
    }
    double getHeight(){
        return height;
    }

    void Volume(){
        System.out.println("Volume of cylinder: " + (3.14 * getRadius() * getRadius() * height));
    }

}

public class Shape {
    public static void main(String args[]){
        Cylinder cy = new Cylinder();
        System.out.println("Cylinder:-");
        cy.setRadius();
        cy.setHeight();
        cy.Volume();
    }
}
/*
************************** OUTPUT **************************
Cylinder:-
Enter Radius:
10
Enter Height:
8
Volume of cylinder: 2512.0

 */
