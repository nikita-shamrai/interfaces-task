package com.company.interface_task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //ВОПРОС - Как переместить Лист printable - в отдельный класс Library?

    static ArrayList<Printable> printable = new ArrayList<>(List.of(new Book("Филиософия Java","Иван Петрович", 2010),
            new Book("Библия","Неизвестен", 0001),
            new Magazine("Forbes","Buisness",2022)));

    public static void main(String[] args) {
        for (Printable prints : printable) {
            prints.print();
            System.out.println(prints.toString());
            System.out.println("___________________");
        }
    }
}

