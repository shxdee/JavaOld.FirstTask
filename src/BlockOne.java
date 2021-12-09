import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class BlockOne {
    public static void two() {
        /* Напишите программу, которая вводит три вещественных числа и выводит их
произведение, среднее арифметическое, а также сами эти числа в порядке
возрастания.
*/
        double a = 0, b = 0, c = 0;
        double d = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 3 числа.");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = a * b * c;
        System.out.println("Их произведение равно " + d + ".");
        d = (a + b + c) / 3 + (a + b + c) % 3;
        System.out.println("Их среднее арифметическое равно " + d + ".");
        System.out.println("Числа в порядке возрастания:");
        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b + " \n" + c);
            } else {
                System.out.println(c + " \n" + b);
            }
        } else {
            if (b <= a && b <= c) {
                System.out.println(b);
                if (a <= c) {
                    System.out.println(a + " \n" + c);
                } else {
                    System.out.println(c + " \n" + a);
                }
            } else {
                if (c <= a && c <= b) {
                    System.out.println(c);
                    if (b <= a) {
                        System.out.println(b + " \n" + a);
                    } else {
                        System.out.println(a + " \n" + b);
                    }
                }
            }
        }

    }

    public static void three() {
        /* Модифицируйте программу из предыдущей задачи так, чтобы она работала с
целыми числами. Правильно ли работает ваша программа, если на вход подать
числа 1, 2, 5?*/
        int a = 0, b = 0, c = 0;
        double d = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 3 числа.");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = a * b * c;
        System.out.println("Их произведение равно " + d + ".");
        d = a + b + c;
        d = d / 3;
        System.out.println("Их среднее арифметическое равно " + d + ".");
        System.out.println("Числа в порядке возрастания:");
        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b + " \n" + c);
            } else {
                System.out.println(c + " \n" + b);
            }
        } else {
            if (b <= a && b <= c) {
                System.out.println(b);
                if (a <= c) {
                    System.out.println(a + " \n" + c);
                } else {
                    System.out.println(c + " \n" + a);
                }
            } else {
                if (c <= a && c <= b) {
                    System.out.println(c);
                    if (b <= a) {
                        System.out.println(b + " \n" + a);
                    } else {
                        System.out.println(a + " \n" + b);
                    }
                }
            }
        }

    }

    public static void four() {
        /* Напишите программу, которая вводит три вещественных числа, понимая их как
коэффициенты квадратного уравнения. Программа производит анализ этого
уравнения на предмет количества корней и находит корни.
*/
        double a = 0, b = 0, c = 0, x1, x2;
        double d = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 3 коэфициента квадратного уравнения.");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(( a==0 )&&(b == 0)&&(c == 0)){
            System.out.println("х - любое число.");
        }else{
            if(( a==0 )&&(b == 0)){
                System.out.println("Действительных корней нет.");
            }else{
                d = b * b - 4 * a * c;
                if (d < 0) {
                    System.out.println("Действительных корней нет.");
                } else {
                    d = Math.sqrt(d);
                    x1 = (-b + d) / 2 * a;
                    x2 = (-b - d) / 2 * a;
                    if (x1 == x2) {
                        c = 1;
                        System.out.println("Корень квадратного уравнения: " + x1 + ".");
                    } else {
                        c = 2;
                        System.out.println("Корни квадратного уравнения: " + x1 + "," + x2 + ".");
                    }
                    System.out.println("Количество корней квадратного уравнения: " + c + ".");

                }

            }
        }
    }

    public static void five() {
        /* Протабулируйте функцию sin(x) в заданных пределах и с заданным шагом.
         */
        double a = 0, b = 0, h = 0, x1, x2;
        double d = 0;
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите верхний и нижний предел табуливания функции sin(x):");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.println("Введите шаг табуливания функции sin(x):");
        h = s.nextDouble();
        i = (int) ((a - b) / h);// столько раз будет выполняться цикл
        Math.abs(i);
        for (int j = 0; j <= i; j++) {
            double y = Math.sin(b);
            String formattedY = new DecimalFormat("#0.000000").format(y);
            String formattedB = new DecimalFormat("#0.000000").format(b);
            System.out.println("Значение аргумента: " + formattedB + "   Значение функции: " + formattedY);
            b = b + h;
        }

    }

    public static void six() {
        /* 6. Напишите программу для решения системы двух линейных уравнений с двумя
неизвестными в вещественных числах.
 */
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, y = 0, x = 0,det = 0;

        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите четыре вещественных коэффициента системы двух линейных уравнений с двумя\n" +
                "неизвестными:");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        System.out.println("Введите два вещественных свободных члена:");
        e = s.nextDouble();
        f = s.nextDouble();
        det = a*d - b*c;
        if (det == 0){
            if((e!=0)||(f!=0)){
                System.out.println("Решений нет.");
            }else{
                System.out.println("Система имеет бесконечно много решений.");}
        }else{
            y = (c * e - a * f) / (b * c - a * d);
            x = (e - b * y) / a;
            System.out.println("x = :" + x + "   y = " + y);
        }
    }

    public static void seven() {
         /* 7. Напишите программу вычисления функции exp(x) разложением в ряд Тейлора с
заданной точностью. Программа должна суммировать члены ряда до тех пор, пока
модуль очередного члена ряда не станет меньше точности.
 */
        double a = 0, e = 1, accuracy = 0, x = 0, xPov = 0, factorial = 1, i = 1, j = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите аргумент функции exp(x):");
        x = s.nextDouble();
        System.out.println("Введите точность вычисления функции exp(x):");
        accuracy = s.nextDouble();
        do {
            xPov = Math.pow(x, i);
            factorial = factorial * i;
            a = (xPov / factorial);
            e = e + a;
            i++;
        } while (a > accuracy);
        System.out.println("Значение функции exp(x): " + e);

    }

    public static void main(String[] avg) {


        int menuChoiсe = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("\n\nВыберите программу для выполнения:");
            System.out.println("2 - ввод трех вещественных чисел и вывод их\n" +
                    "произведения, среднего арифметического, а также самих этих чисел в порядке\n" +
                    "возрастания.");
            System.out.println("3 - 2 с целыми числами.");
            System.out.println("4 - решение квадратного уравнения по трем заданым коэффициентам.");
            System.out.println("5 - табуляция функции sin(x) в заданных пределах и с заданным шагом.");
            System.out.println("6 - решение системы двух линейных уравнений с двумя\n" +
                    "неизвестными в вещественных числах.");
            System.out.println("7 - вычисление функции exp(x) разложением в ряд Тейлора с\n" +
                    "заданной точностью.");
            System.out.println("8 - выход.");
            menuChoiсe = s.nextInt();
            if (menuChoiсe == 2) {
                two();
            }
            if (menuChoiсe == 3) {
                three();
            }
            if (menuChoiсe == 4) {
                four();
            }
            if (menuChoiсe == 5) {
                five();
            }
            if (menuChoiсe == 6) {
                six();
            }
            if (menuChoiсe == 7) {
                seven();
            }
        } while (menuChoiсe != 8);

    }
}
