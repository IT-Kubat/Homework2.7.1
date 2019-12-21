package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Определите высоту зданий:");
        Scanner scan = new Scanner(System.in);
        String height = scan.nextLine();
        String height1 = scan.nextLine();
        String height2 = scan.nextLine();
        String height3 = scan.nextLine();
        String height4 = scan.nextLine();

        List<String> heightall = new ArrayList<>();
        heightall.add(height);
        heightall.add(height1);
        heightall.add(height2);
        heightall.add(height3);
        heightall.add(height4);

        Iterator<String> iter = heightall.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("Напишите количество этажей: ");
        Scanner scanner2 = new Scanner(System.in);
        String number = scanner2.nextLine();
        String number1 = scanner2.nextLine();
        String number2 = scanner2.nextLine();
        String number3 = scanner2.nextLine();
        String number4 = scanner2.nextLine();

        List<String> numbers = new ArrayList<>();
        numbers.add(number);
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        Iterator<String> iter1 = numbers.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("---------------- ");
        System.out.println("Высота и Кол-во: ");
        System.out.println("-----------------");
        List<String> heightNumber = new ArrayList<>();
        heightNumber.add(height);
        heightNumber.add(number4);
        heightNumber.add(height1);
        heightNumber.add(number3);
        heightNumber.add(height2);
        heightNumber.add(number2);
        heightNumber.add(height3);
        heightNumber.add(number1);
        heightNumber.add(height4);
        heightNumber.add(number);
        Collections.reverse(heightNumber);
        Iterator<String> iter2 = heightNumber.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println("---------------");
        System.out.println("Сортировка по длине: ");
        System.out.println("---------------");
        Collections.sort(heightNumber, Comparator.comparingInt(String::length));
        iter2 = heightNumber.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }


        Collections.sort(heightNumber, (s, t1) -> {

            if (s.length() < t1.length()) {
                return -1;
            } else if (s.length() > t1.length()) {
                return 11;
            } else {
                return 0;
            }
        });
    }}