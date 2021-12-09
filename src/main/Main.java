package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] avg) {
        int Choiсe = 0;
        int mainChoiсe = 0;
        Scanner s = new Scanner(System.in);
        Vector3D vector = new Vector3D();
        do {
            System.out.println("Выберите класс для тестирования:");
            System.out.println("1.Vector3D.");
            System.out.println("2.Vector3DProcessor.");
            System.out.println("3.Vector3DArray.");
            System.out.println("4.Выход из программы.");
            mainChoiсe = s.nextInt();
            if (mainChoiсe == 1) {

                System.out.println("Выберите способ создания вектора:");
                System.out.println("1.Без параметров (нулевой).");
                System.out.println("2.По координатам.");
                System.out.println("3.По двум точкам.");
                Choiсe = s.nextInt();

                if (Choiсe == 1) {
                } else {
                    if (Choiсe == 2) {
                        System.out.println("Введите координаты вектора:");
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        double z = s.nextDouble();
                        vector = new Vector3D(x, y, z);
                    } else {
                        if (Choiсe == 3) {
                            System.out.println("Введите координаты точки начала вектора:");
                            double x = s.nextDouble();
                            double y = s.nextDouble();
                            double z = s.nextDouble();
                            System.out.println("Введите координаты точки конца вектора:");
                            double x1 = s.nextDouble();
                            double y1 = s.nextDouble();
                            double z1 = s.nextDouble();
                            Point3D pointOne = new Point3D(x, y, z);
                            Point3D pointTwo = new Point3D(x1, y1, z1);
                            vector = new Vector3D(pointOne, pointTwo);
                        } else {
                            System.exit(0);
                        }
                    }
                }
                System.out.println("Заданный вектор:");
                vector.vectorPrint();
                System.out.println("Длина заданного вектора равна: " + vector.vectorLength());
                System.out.println("Введите координаты еще одного вектора:");
                double x = s.nextDouble();
                double y = s.nextDouble();
                double z = s.nextDouble();
                Vector3D anotherVector = new Vector3D(x, y, z);
                if (anotherVector.vectorEqualityCheck(vector) == true) {
                    System.out.println("Заданные векторы равны.");
                } else {
                    System.out.println("Заданные векторы не равны.");
                }
            }
            if (mainChoiсe == 2) {
               /* 1) сумма и разность двух векторов,
                        2) скалярное произведение двух векторов
                3) векторное произведение двух векторов
                4) проверка коллинеарности двух векторов*/
                System.out.println("Введите координаты первого вектора:");
                double x = s.nextDouble();
                double y = s.nextDouble();
                double z = s.nextDouble();
                System.out.println("Введите координаты второго вектора:");
                double x1 = s.nextDouble();
                double y1 = s.nextDouble();
                double z1 = s.nextDouble();
                vector = new Vector3D(x, y, z);
                Vector3D anotherVector = new Vector3D(x1, y1, z1);
                Vector3DProcessor vr = new Vector3DProcessor();
                Vector3D tmp = vr.vectorSum(vector, anotherVector);
                System.out.println("Cумма векторов равна: " );
                tmp.vectorPrint();
                System.out.println("Cкалярное произведение векторов равно: " + vr.vectorScalarProduction(vector, anotherVector));
                tmp = vr.vectorProduction(vector, anotherVector);
                System.out.println("Векторное произведение векторов равно: ");
                tmp.vectorPrint();
                if (vr.vectorCheckCollinerity(vector, anotherVector) == true){
                    System.out.println("Заданные вектора коллинеарны.");
                }else{
                    System.out.println("Заданные вектора неколлинеарны.");
                }
            }
            if (mainChoiсe == 3) {
                System.out.println("Введите размер массива векторов:");
                int size = s.nextInt();
                Vector3DArray array = new Vector3DArray(size);
                int arrayChoiсe = 0;
                Vector3D tmp = new Vector3D();

                do {
                    System.out.println("Введите пункт:");
                    System.out.println("1) длина массива");
                    System.out.println("2) замена i-го элемента массива на заданный вектор");
                    System.out.println("3) наибольшая длина вектора массиве");
                    System.out.println("4) поиск заданного вектора в массиве");
                    System.out.println("5) сумма всех векторов в массиве");
                    System.out.println("6) метод, который получает на вход массив вещественных чисел (коэффициентов)");
                    System.out.println("и вычисляет линейную комбинацию векторов с заданными коэффициентами");
                    System.out.println("7) метод, который получает на вход точку P и вычисляет массив точек, каждая из которых -");
                    System.out.println("результат сдвига точки P, на соответствующий вектор");
                    System.out.println("8) выход в главное меню");
                    arrayChoiсe = s.nextInt();
                    if (arrayChoiсe == 1){
                        System.out.println("Длина массива равна " + array.varrayLength());
                    }
                    if (arrayChoiсe == 2){
                        System.out.println("Введите координаты вектора:");
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        double z = s.nextDouble();
                        vector = new Vector3D(x, y, z);
                        System.out.println("Введите индекс заменяемого элемента массива: ");
                        int index = s.nextInt();
                        array.changeElement(vector, index);
                    }
                    if (arrayChoiсe == 3){
                        System.out.println("Наибольшая длина вектора в массиве равна " + array.longestVector());
                    }
                    if (arrayChoiсe == 4){
                        System.out.println("Введите координаты вектора:");
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        double z = s.nextDouble();
                        vector = new Vector3D(x, y, z);
                        if (array.searchVector(vector) < 0){
                            System.out.println("Данный вектор в массиве не найден.");
                        }else{
                            System.out.println("Данный вектор нашелся в массиве под индексом " + array.searchVector(vector));
                        }
                    }
                    if (arrayChoiсe == 5){
                        tmp = array.sumArrayVectors();
                        System.out.println("Сумма всех векторов в массиве равна ");
                        tmp.vectorPrint();
                    }
                    if (arrayChoiсe == 6){
                        double[] arrayCoefficients = new double[size];
                        System.out.println("Введите коэффициенты: ");
                        for (int i = 0; i < size; i ++){
                            arrayCoefficients[i] = s.nextDouble();
                        }
                        tmp = array.linearCombination(arrayCoefficients);
                        System.out.println("Линейная комбинация векторов массива с заданными коэффициентами равна ");
                        tmp.vectorPrint();
                    }
                    if (arrayChoiсe == 7){
                        System.out.println("Введите координаты точки: ");
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        double z = s.nextDouble();
                        Point3D point = new Point3D(x, y, z);
                        Point3D[] arrayPoint = array.pointShiftArray(point);
                        System.out.println("Полученный массив: ");
                        for (Point3D i: arrayPoint){
                            i.pointPrint();
                        }
                    }
                }while(arrayChoiсe != 8);
            }
        }while(mainChoiсe<4);
    }
}

