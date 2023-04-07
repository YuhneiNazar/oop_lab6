package com.triad;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Triad t = new Triad();
        t.Read();
        t.Display();
        System.out.println("Введіть число для +, *, <>:");
        int num = scan.nextInt();
        t.Aroper(num);
        System.out.println("Введіть кординати:");
        Triad.Vector3D v1 = new Triad.Vector3D(t);
        Triad t2 = new Triad();
        t2.Read();
        Triad.Vector3D v2 = new Triad.Vector3D(t2);
        System.out.println("Скалярний добуток векторів = "+v1.dotProduct(v2));
        v1.add(v2);
        System.out.println("Додавання векторів "+v1.ToString());
    }
}