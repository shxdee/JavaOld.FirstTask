package main;

import java.util.Objects;
import java.util.Scanner;

public class Point3D {/*15. Разработайте класс main.Point3D (точка в трехмерном пространстве). Точка хранится в
виде набора декартовых координат. Методы:
1) конструктор по координатам,
2) конструктор без параметров (создает точку – начало координат),
3) геттеры и сеттеры,
4) вывод точки на консоль.
Создайте несколько объектов этого класса. Сравните две точки на равенство. Для
какого-то из объектов проверьте, равна ли эта точка сама себе. */
    private double x, y, z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void pointPrint() {
        System.out.println(this);
    }

    public boolean pointCheckEquality(Point3D pointOne) {
        boolean pointEquality = false;
        if ((Math.abs(pointOne.getX() - x) <= 5e-20) && (Math.abs(pointOne.getY() - y) <= 5e-20) && (Math.abs(pointOne.getZ() - z) <= 5e-20)) {
            pointEquality = true;
        }
        return pointEquality;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D pointOne = (Point3D) o;
        return ((Math.abs(pointOne.getX() - x) <= 1e-20) && (Math.abs(pointOne.getY() - y) <= 1e-20) && (Math.abs(pointOne.getZ() - z) <= 1e-20));
    }


    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите координаты точки в трехмерном простанстве:");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        Point3D pointOne = new Point3D(x, y, z);
        System.out.println("Введите координаты второй точки в трехмерном простанстве:");
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();
        Point3D pointTwo = new Point3D(x, y, z);
        boolean equality = false;
        equality = pointOne.pointCheckEquality(pointTwo);
        if (equality == true) {
            System.out.println("Заданные точки равны.");
        } else {
            System.out.println("Заданные точки не равны.");
        }
        equality = pointOne.pointCheckEquality(pointOne);
        if (equality == true) {
            System.out.println("Первая точка равна сама себе.");
        } else {
            System.out.println("Первая точка не равна сама себе.");
        }
    }
}
