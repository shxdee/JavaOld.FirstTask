package main;

import java.util.Scanner;

public class Vector3D {/*16. Разработайте класс main.Vector3D (вектор в трехмерном пространстве). Вектор хранится
в виде набора своих координат. Методы:
1) конструктор без параметров (создает нулевой вектор),
2) конструктор по координатам,
3) конструктор по двум точкам (main.Point3D),
4) длина вектора,
5) проверка равенства с заданным вектором.*/
    private double x, y, z;

    public Vector3D() {
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D begin, Point3D end) {
        this.x = end.getX() - begin.getX();
        this.y = end.getY() - begin.getY();
        this.z = end.getZ() - begin.getZ();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void vectorPrint() {
        System.out.println("[" + x + "," + y + "," + z + "]");
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z + z);
    }

    public boolean vectorEqualityCheck(Vector3D vector) {
        boolean vectorEqualityCheck = false;
        if ((Math.abs(vector.getX() - x) <= 5e-20) && (Math.abs(vector.getY() - y) <= 5e-20) && (Math.abs(vector.getZ() - z) <= 5e-20)) {
            vectorEqualityCheck = true;
        }
        return vectorEqualityCheck;
    }

}