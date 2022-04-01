package com.company.bool;

public class Bool1 {
    public static void main(String[] args) {
        // Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        int a = 2, b = 2, c=2;
        boolean b1 = a==b; // задаем, что число нечетное
        boolean b2 = b==c;
        boolean b3 = c==a;
        boolean b4 = (b1 || b2 || b3);
                System.out.println(b4);



    }
}
