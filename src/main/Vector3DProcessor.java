package main;

public class Vector3DProcessor {/*17. Разработайте класс  main.Vector3DProcessor с методами:
1) сумма и разность двух векторов,
2) скалярное произведение двух векторов
3) векторное произведение двух векторов
4) проверка коллинеарности двух векторов*/

    public Vector3D vectorSum(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D vectorSum = new Vector3D(vectorOne.getX() + vectorTwo.getX(), vectorOne.getY() + vectorTwo.getY(), vectorOne.getZ() + vectorTwo.getZ());
        return vectorSum;
    }

    public Vector3D vectorDifference(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D vectorDifference = new Vector3D(vectorOne.getX() - vectorTwo.getX(), vectorOne.getY() - vectorTwo.getY(), vectorOne.getZ() - vectorTwo.getZ());
        return vectorDifference;
    }

    public double vectorScalarMultiplication(Vector3D vectorOne, Vector3D vectorTwo) {
        double vectorScalarMultiplication = vectorOne.getX() * vectorTwo.getX() + vectorOne.getY() * vectorTwo.getY() + vectorOne.getZ() * vectorTwo.getZ();
        return vectorScalarMultiplication;
    }

    public Vector3D vectorMultiplication(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D vectorMultiplication = new Vector3D(vectorOne.getY() * vectorTwo.getZ() - vectorTwo.getY() * vectorOne.getZ(),
                vectorOne.getX() * vectorTwo.getZ() - vectorTwo.getX() * vectorOne.getZ(),
                vectorOne.getX() * vectorTwo.getY() - vectorTwo.getX() * vectorOne.getY());
        return vectorMultiplication;
    }

    public boolean vectorCheckCollinearity(Vector3D vectorOne, Vector3D vectorTwo) {
        Vector3D Multiplication = vectorMultiplication(vectorOne, vectorTwo);
        if ((Multiplication.getX() == 0) && (Multiplication.getY() == 0) && (Multiplication.getZ() == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

