/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(4, 5);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(10);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
}
}
