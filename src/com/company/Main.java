package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MeatCow m1 = new MeatCow("Dora", 1315, 348, 215);
        MilkCow m2 = new MilkCow("Mila", 1488, 280, 16);

        if (m1.getWeight() > 300)
            System.out.println("Пустить на мясо " + m1.getName());
        else
            System.out.println("продолжать откармливать" + m1.getName());



        m2.whatToDo();




    }
}
