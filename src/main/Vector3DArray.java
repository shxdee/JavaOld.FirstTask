package main;

public class Vector3DArray {/*18. Разработайте класс  main.Vector3DArray с методами:
1) конструктор по размеру(создает массив из нулевых векторов),
2) длина массива,
3) замена i-го элемента массива на заданный вектор,
4) наибольшая длина вектора массиве
5) поиск заданного вектора в массиве(результат - индекс первого вхождения или -1, если не найден),
6) сумма всех векторов в массиве,
7) метод, который получает на вход массив вещественных чисел (коэффициентов)
и вычисляет линейную комбинацию векторов с заданными коэффициентами.
При несовпадении длин массивов векторов и коэффициентов, результатом
считать нулевой вектор (если кто-то знает, как работать с исключениями, то
выбросить исключение),
8) метод, который получает на вход точку P (типа main.Point3D) и вычисляет массив точек, каждая из которых -
результат сдвига точки P, на соответствующий вектор.*/
    private Vector3D[] array;

    public Vector3DArray(int size) {

        array = new Vector3D[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Vector3D();
        }
    }

    public int varrayLength() {
        return array.length;
    }

    public Vector3D getElement(int i) {
        return array[i];
    }

    public void changeElement(Vector3D vector, int index) {
        array[index] = vector;
    }

    public double longestVector() {
        double length = 0;
        for (int i = 0; i < varrayLength(); i++) {
            if (length < array[i].vectorLength()) {
                length = array[i].vectorLength();
            }
        }
        return length;
    }

    public int searchVector(Vector3D vector) {
        for (int i = 0; i < varrayLength(); i++) {
            if ((Math.abs(vector.getX() - array[i].getX()) <= 5e-20) && (Math.abs(vector.getY() - array[i].getY()) <= 5e-20) && (Math.abs(vector.getY() - array[i].getY()) <= 5e-20)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D sumArrayVectors() {
        Vector3D sum = new Vector3D();
        Vector3DProcessor vr = new Vector3DProcessor();
        for (int i = 0; i < varrayLength(); i++) {
            sum = vr.vectorSum(sum, array[i]);
        }
        return sum;
    }

    public Vector3D linearCombination(double[] arrayCoefficients) {
        Vector3D resultVector = new Vector3D();
        if (arrayCoefficients.length == array.length) {
            for (int i = 0; i < arrayCoefficients.length; i++) {
                resultVector = new Vector3D(resultVector.getX() + array[i].getX() * arrayCoefficients[i], resultVector.getY() + array[i].getY() * arrayCoefficients[i], resultVector.getZ() + array[i].getZ() * arrayCoefficients[i]);
            }
        }
        return resultVector;
    }

    public Point3D[] pointShiftArray(Point3D point) {
        Point3D[] arrayPoint = new Point3D[varrayLength()];
        for (int i = 0; i < varrayLength(); i++) {
            arrayPoint[i] = new Point3D(point.getX() + array[i].getX(), point.getY() + array[i].getY(), point.getZ() + array[i].getZ());
        }
        return arrayPoint;
    }

}
