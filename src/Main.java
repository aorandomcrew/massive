import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[]{1, 2, 3};
        float[] second = {1.57f, 7.654f, 9.986f};
        int[] bigBox = {5, 6, 12};
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Вывод первого массива без запятой в конце
        int[] first = new int[]{1, 2, 3};
        for (int index = 0; index < first.length; index++) {
            if (index == first.length - 1) {
                System.out.println(first[index]);
                break;
            }
            System.out.print(first[index] + ", ");
        }
        //вывод второго массива без запятой в конце
        float[] second = {1.57f, 7.654f, 9.986f};
        for (int index = 0; index < second.length; index++) {
            if (index == second.length - 1) {
                System.out.println(second[index]);
                break;
            }
            System.out.print(second[index] + ", ");
        }
        //вывод третьего массива без запятой в конце
        int[] bigBox = {5, 6, 12};
        for (int index = 0; index < bigBox.length; index++) {
            if (index == bigBox.length - 1) {
                System.out.println(bigBox[index]);
                break;
            }
            System.out.print(bigBox[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        //Вывод первого массива в обратном порядке
        int[] first = new int[]{1, 2, 3};
        for (int index = first.length - 1; index>= 0; index--) {
            if (index == 0) {
                System.out.println(first[0]);
                break;
            }
            System.out.print(first[index] + ", ");
        }
        //Вывод второго массива в обратном порядке
        float[] second = {1.57f, 7.654f, 9.986f};
        for (int index = first.length-1; index>=0; index--)  {
            {if (index == 0) {
                    System.out.println(second[0]);
                    break;
                }
                System.out.print(second[index] + ", ");
            }
        }
        //Вывод третьего массива в обратном порядке
        int[] bigBox = {5, 6, 12};
        for (int index = bigBox.length - 1; index>= 0; index--) {
            if (index == 0) {
                System.out.println(bigBox[0]);
                break;
            }
            System.out.print(bigBox[index] + ", ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] first = new int[]{1, 2, 3};
        for (int index = 0; index < first.length; index++) {
            if (index == first.length - 1) {
                System.out.println(first[index]+1);
                break;
            }
            if(index%2==0){
                first[index]=first[index]+1;
            }
            System.out.print(first[index] + ", ");
        }
    }
}
