package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1,2
        int[] a = new int[]{1, 2, 3};
        System.out.print(a[0] + ", ");
        System.out.print(a[1] + ", ");
        System.out.print(a[2]);
        System.out.println();
        double[] b = new double[]{1.57, 7.654, 9.986};
        System.out.print(b[0] + ", ");
        System.out.print(b[1] + ", ");
        System.out.print(b[2]);
        System.out.println();
        int[] weights = {1, 5, 8, 10, 6, 7};
        System.out.print(weights[0] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.print(weights[2] + ", ");
        System.out.print(weights[3] + ", ");
        System.out.print(weights[4] + ", ");
        System.out.print(weights[5]);
        System.out.println();
        //Задание 3 (есть вопрос, я понимаю, что здесь намного лучше и проще сделать через цикл for, но как мне поставить запятые между элементами?)
        System.out.print(a[2] + ", ");
        System.out.print(a[1] + ", ");
        System.out.print(a[0]);
        System.out.println();
        System.out.print(b[2] + ", ");
        System.out.print(b[1] + ", ");
        System.out.print(b[0]);
        System.out.println();
        System.out.print(weights[5] + ", ");
        System.out.print(weights[4] + ", ");
        System.out.print(weights[3] + ", ");
        System.out.print(weights[2] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.print(weights[0]);
        System.out.println();
        //Задание 4
        int[] c = {1, 2, 3};
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 != 0) {
                c[i] = c[i] + 1;
            } else if (c[i] % 2 == 0) ;
            System.out.print(c[i] + ", ");
            {

        }


    }


    }
}



