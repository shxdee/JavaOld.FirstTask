import java.util.Scanner;
public class BlockTwo {

                public static void eight(double[]array) {/*8. Вывод массива на консоль.*/
                    for (int i = 0; i<array.length; i++) {
                        System.out.println(array[i] + " ");
                    }
                }
                public static void nine(double[]array) {/*9. Ввод элементов массива с клавиатуры.*/
                    Scanner s = new Scanner(System.in);
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i<array.length; i++) {
                        array[i]= s.nextDouble();
                    }
                    System.out.println("Массив заполнен!");
                }
                public static double ten(double[]array) {/*10. Сумма всех элементов массива.*/
                    double sum = 0;
                    for (int i = 0; i<array.length; i++) {
                        sum = sum + array[i];
                    }
                    return sum;
                }
                public static double eleven(double[]array) {/*11. Количество четных чисел в массиве.*/
                    double quantity = 0;
                    for (int i = 0; i<array.length; i++) {
                        if (array[i]%2 == 0){
                            quantity++;
                        }
                    }
                    return quantity;
                }
                public static double twelve(double[]array, double a, double b) {/*12. Количество элементов массива, принадлежащих отрезку [a; b].*/
                    double quantity = 0;
                    for (int i = 0; i<array.length; i++) {
                        if ((array[i] >= a)&&(array[i] <= b)){
                            quantity++;
                        }
                    }
                    return quantity;
                }
                public static boolean thirteen(double[]array) {/*13. Проверка: все ли элементы массива положительные.
    Возвращает true или false (true - когда все положительные, false - в противном случае)*/
                    boolean check = true;
                    for (int i = 0; i<array.length; i++) {
                        if (array[i] <= 0 ){
                            check = false;
                        }
                    }
                    return check;
                }
                public static void fourteen(double[]array) {/*14. Переставьте в массиве элементы в обратном порядке.*/
                    double temp = 0;

                    for (int i = 0; i<(array.length-1); i++) {
                        temp = array[array.length - 1];
                        for (int j = (array.length - 2); j>(i-1); j--){
                            array[j+1] = array[j];
                        }
                        array[i]= temp;
                    }
                    System.out.println("Полученный массив: ");
                    for (int ii = 0; ii<array.length; ii++) {
                        System.out.println(array[ii] + " ");
                    }
                }

                public static void main(String[] avg) {


                    int menuChoiсe = 0, n = 0;
                    double quantity = 0, a = 0, b = 0;
                    boolean check;
                    Scanner s = new Scanner(System.in);
                    System.out.println("Введите количество элементов массива:");
                    n = s.nextInt();
                    double[] array = new double[n];
                    do {
                        System.out.println("\n\nВыберите программу для выполнения:");
                        System.out.println("8. Вывод массива на консоль.");
                        System.out.println("9. Ввод элементов массива с клавиатуры.");
                        System.out.println("10. Сумма всех элементов массива.");
                        System.out.println("11. Количество четных чисел в массиве.");
                        System.out.println("12. Количество элементов массива, принадлежащих отрезку [a; b].");
                        System.out.println("13. Проверка: все ли элементы массива положительные.");
                        System.out.println("14. Переставьте в массиве элементы в обратном порядке.");
                        System.out.println("15. Выход.");
                        menuChoiсe = s.nextInt();
                        if (menuChoiсe == 8) {
                            eight(array);
                        }
                        if (menuChoiсe == 9) {
                            nine(array);
                        }
                        if (menuChoiсe == 10) {
                            double sum = ten(array);
                            System.out.println("Сумма всех элементов массива равна " + sum);
                        }
                        if (menuChoiсe == 11) {
                            quantity = eleven(array);
                            System.out.println("Количество четных чисел в массиве равно "+ quantity);
                        }
                        if (menuChoiсe == 12) {
                            System.out.println("Введите крайние точки отрезка [a; b]");
                            a = s.nextDouble();
                            b = s.nextDouble();
                            quantity = twelve(array, a, b);
                            System.out.println("12. Количество элементов массива, принадлежащих отрезку ["+ a+"; "+ b+"] равно "+ quantity);
                        }
                        if (menuChoiсe == 13) {
                            check = thirteen(array);
                            if (check){
                                System.out.println("Все элементы массива положительные.");
                            }else{
                                System.out.println("Не все элементы массива положительные.");
                            }
                        }
                        if (menuChoiсe == 14) {
                            fourteen(array);
                        }
                    } while (menuChoiсe != 15);

                }
            }
