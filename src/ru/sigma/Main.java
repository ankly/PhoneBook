package ru.sigma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by Student08 on 14.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Contact> book =new ArrayList<Contact>();



        while (true) {
            System.out.println("Введите действие");
            System.out.println("1 - добавить");
            System.out.println("2 - удалить");
            System.out.println("3 - вывести");
            System.out.println("4 - выход");

            int answer = scan.nextInt();


            if (answer == 1) {
                System.out.println("имя");
                String name = scan.next();
                System.out.println("телефон");
                String phone = scan.next();
                System.out.println("email");
                String email = scan.next();


                Contact contact = new Contact(name, phone, email);
                book.add(contact);
            }

                else if (answer == 2) {
                System.out.println("имя");
                String name = scan.next();

                for (int i = 0; i < book.size() ; i++) {
                    if (name.equals(book.get(i).name)){
                        book.remove(i);
                        break;
                    }
                }


                } else if (answer == 3) {
                    for (int i = 0; i < book.size(); i++) {
                        System.out.println(book.get(i).name + " " + book.get(i).phone + " " + book.get(i).email);
                    }

                } else if (answer == 4) {
                    System.exit(0);

                } else System.out.println("некорректное значение");

            }
        }
    }

